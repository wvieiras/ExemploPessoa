package br.com.exemplo.pessoa.request

import br.com.exemplo.pessoa.entity.Endereco
import br.com.exemplo.pessoa.entity.Pessoa
import com.fasterxml.jackson.annotation.JsonAlias
import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty

data class PessoaRequest(

    @NotBlank
    val name: String,

    @JsonAlias("endereco_id")
    val enderecoId: Long

){
    fun toModel(endereco: Endereco): Pessoa {
        return Pessoa(
            id = 0,
            name = name,
            endereco = endereco
        )
    }
}
