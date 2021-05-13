package br.com.zup.autor

import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import java.util.*
import javax.validation.Valid
import javax.validation.constraints.Email

@Validated
@Controller("/autores")
class AutorController(val autorRepository: AutorRepository) {

    @Post
    fun cadastrarAutor(@Body @Valid autorRequest: AutorRequest): Autor {
        return autorRepository.save(autorRequest.toAutor())
    }
    @Get
    fun buscaTudo():List<Autor> = autorRepository.findAll()

    /*@Get("/{id}")
    fun searchById(@PathVariable id: Long?): Autor? {
        val autor: Optional<Autor> = autorRepository.findById(id)
        if (autor.isPresent) {
            return autor.get()
        }
        return null
    }*/
    // autores?email=email
    @Get("/{email}")
    fun searchByEmail(@QueryValue email: String?): Autor? {
        val autor: Optional<Autor> = autorRepository.findByEmail(email.toString())
        if (autor.get().email.isNotEmpty()) {
            return  autor.get()
        }
        return null
    }
}