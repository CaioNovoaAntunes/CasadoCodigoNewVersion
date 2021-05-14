package br.com.zup.autor

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Endereco(
    val cep: String?,
    val logradouro: String,
    val completo: String?,
    val bairro: String?,
    val localidade: String?,
    val uf: String?
) {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null

    override fun toString(): String {
        return "cep=$cep, logradouro='$logradouro', completo=$completo, bairro=$bairro, localidade=$localidade, uf=$uf, id=$id)"
    }


}
