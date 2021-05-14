package autores

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.Email
import javax.validation.constraints.Size

@Introspected
class AutorUpdateRequest(
    val nome:String?,
    @field:Email val email:String?,
    @field:Size(max = 400) val descricao:String?
    ){

//    fun atualizaAutor(autor : Autor){
//      return autor.atualizaAutor(AutorUpdateRequest(nome, email, descricao))
//    }
}
