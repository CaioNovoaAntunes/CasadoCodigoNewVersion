package br.com.zup.autor

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.QueryValue

@Client("https://viacep.com.br/ws")
interface EnderecoCliente {

    //Get irá para URI -> http://localhost:8081/cep/{cep}
    @Get("/{cep}/json")
    fun consulta(@QueryValue cep:String):HttpResponse<EnderecoResponse>

}


