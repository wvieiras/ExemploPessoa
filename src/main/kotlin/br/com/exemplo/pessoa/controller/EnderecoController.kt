package br.com.exemplo.pessoa.controller

import br.com.exemplo.pessoa.request.EnderecoRequest
import br.com.exemplo.pessoa.service.ServiceEndereco
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/endereco")
class EnderecoController(val service: ServiceEndereco) {

    @PostMapping
    fun createEndereco(@RequestBody request: EnderecoRequest){
        service.createEndereco(request)
    }

}