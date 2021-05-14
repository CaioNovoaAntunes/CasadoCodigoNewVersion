package br.com.zup.autor

import autores.AutorUpdateRequest
import io.micronaut.http.annotation.*
import io.micronaut.http.uri.UriBuilder
import io.micronaut.validation.Validated
import java.net.http.HttpResponse
import java.util.*
import javax.transaction.Transactional
import javax.validation.Valid

@Validated
@Controller("/autores")
class AutorController(val autorRepository: AutorRepository) {
    @Transactional
    @Post
    fun salvaAutor(@Body @Valid autorRequest: AutorRequest): Autor =
        autorRepository.save(autorRequest.toAutor())


    @Get
    fun buscaTudo(): List<Autor> = autorRepository.findAll()

    //dominio.com.br/autores/1

    @Get("/seila/{id}")
    fun buscaPorID(@PathVariable id: Long): Autor? {

        val autor: Optional<Autor> = autorRepository.findById(id)

        if (autor.isPresent) {
            return autor.get()
        }

        return null
    }


    //localhost:8080/autores/email?email=caio@email.com
    @Transactional
    @Get("/email")
    fun buscaPorEmail(@QueryValue email: String): io.micronaut.http.HttpResponse<Any> {

        val emailConsultado = autorRepository.findByEmail(email)

        if (emailConsultado.isPresent) {

            return io.micronaut.http.HttpResponse.ok(emailConsultado.get())
            println(emailConsultado.get().nome)
        }
        return io.micronaut.http.HttpResponse.notFound()
    }
    //EndPoint para buscar por Id as mudanças que será feita
    @Put("/{id}")
    fun alterarAutor(@PathVariable id:Long ,@Body @Valid novoAutor:AutorUpdateRequest): io.micronaut.http.HttpResponse<Any> {
        // buscando autor por Id, o que foi registrado no banco, o cadastro que será alterado, poderia ser um email, o qual seria findByEmail.
        val autorDoBanco = autorRepository.findById(id)


        //Após buscar o autor eu verifico se ele está presente no banco
        if(autorDoBanco.isPresent){

            // caso esteja presente coloco ele dentro de uma variável
            var autorModificado = autorDoBanco.get()
            autorModificado.atualizaAutor(novoAutor = novoAutor)

            autorModificado = autorRepository.update(autorModificado)

            val uri = UriBuilder.of("/autores/{id}")
                .expand(mutableMapOf("id" to autorModificado.id))

            return io.micronaut.http.HttpResponse.created(uri)

        }

        return io.micronaut.http.HttpResponse.notFound()

    }

    @Delete("/delet/{id}")
    fun deleta(@PathVariable id:Long): io.micronaut.http.HttpResponse<Any>{
        val autorQueVemDoBanco = autorRepository.findById(id)
        if(autorQueVemDoBanco.isEmpty){
            return  io.micronaut.http.HttpResponse.notFound()

        }
        autorRepository.deleteById(id)
        return io.micronaut.http.HttpResponse.ok()
    }
}