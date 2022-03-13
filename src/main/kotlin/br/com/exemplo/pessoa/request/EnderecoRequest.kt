package br.com.exemplo.pessoa.request

import br.com.exemplo.pessoa.entity.Endereco

data class EnderecoRequest (
    val nomeRua: String
        ){
    fun toModel(): Endereco{
        return Endereco(
            id = 0,
            nomeRua = nomeRua
        )

    }
}
