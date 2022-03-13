package br.com.exemplo.pessoa.controller

import br.com.exemplo.pessoa.request.PessoaRequest
import br.com.exemplo.pessoa.service.ServiceEndereco
import br.com.exemplo.pessoa.service.ServicePessoa
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.constraints.NotBlank


@RestController
@RequestMapping("/pessoa")
class PessoaController(
    val servicePessoa: ServicePessoa,
    val serviceEndereco: ServiceEndereco
) {


    @PostMapping
    fun postPessoa(@RequestBody request: PessoaRequest){
        val endereco = serviceEndereco.getById(request.enderecoId)
        servicePessoa.createPessoa(request.toModel(endereco))
    }
}