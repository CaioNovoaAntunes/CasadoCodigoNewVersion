package br.com.zup.autor

import io.micronaut.http.annotation.*
import io.micronaut.http.uri.UriBuilder
import io.micronaut.validation.Validated
import java.net.http.HttpResponse
import java.util.*
import javax.validation.Valid
import javax.validation.constraints.Email

@Validated
@Controller("/autores")
class AutorController(val autorRepository: AutorRepository) {

    @Post
    fun salvaAutor(@Body @Valid autorRequest: AutorRequest): Autor =
        autorRepository.save(autorRequest.toAutor())


    @Get
    fun buscaTudo(): List<Autor> = autorRepository.findAll()

    //dominio.com.br/autores/1

    @Get("/{id}")
    fun buscaPorID(@PathVariable id: Long): Autor? {

        val autor: Optional<Autor> = autorRepository.findById(id)

        if (autor.isPresent) {
            return autor.get()
        }

        return null
    }

    //localhost:8080/autores?email?email=caio@email.com
    @Get("/email")
    fun buscaPorEmail(@QueryValue email: String): io.micronaut.http.HttpResponse<Any> {

        val emailConsultado = autorRepository.findByEmail(email)

        if (emailConsultado.isPresent) io.micronaut.http.HttpResponse.ok(emailConsultado.get())

        return io.micronaut.http.HttpResponse.notFound()

    }

}