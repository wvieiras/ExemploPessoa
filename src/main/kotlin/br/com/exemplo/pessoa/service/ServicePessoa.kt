package br.com.exemplo.pessoa.service

import br.com.exemplo.pessoa.entity.Pessoa
import br.com.exemplo.pessoa.repository.PessoaRepository
import org.springframework.stereotype.Service

@Service
class ServicePessoa(val repository: PessoaRepository){

    fun createPessoa(request: Pessoa){
        repository.save(request)
    }

}
