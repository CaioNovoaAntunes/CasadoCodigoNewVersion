package br.com.zup.autor

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank

@Introspected
class AutorRequest(
    @field:NotBlank  val nome: String,
    @field:NotBlank val descricao: String,
    @field:NotBlank @field: Email val email: String
){
    fun toAutor():Autor{
        return Autor(nome,descricao,email)

    }

}


