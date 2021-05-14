package br.com.zup.autor

import autores.AutorUpdateRequest
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Autor(
    var nome: String,
    var descricao: String,
    var email: String
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    val createAT: LocalDateTime = LocalDateTime.now()


    //método criado para não setar direto, representa o novoAutor da classe Request
    fun atualizaAutor(novoAutor: AutorUpdateRequest) {

        //Essas verificações representa verifiicações da nova classe de autores/info
        if (!novoAutor.nome.isNullOrBlank()) this.nome = novoAutor.nome
        if (!novoAutor.email.isNullOrBlank()) this.email = novoAutor.email
        if (!novoAutor.descricao.isNullOrBlank()) this.descricao = novoAutor.descricao


    }

}

