package br.com.exemplo.pessoa.service

import br.com.exemplo.pessoa.entity.Endereco
import br.com.exemplo.pessoa.repository.RepositoryEndereco
import br.com.exemplo.pessoa.request.EnderecoRequest
import org.springframework.stereotype.Service

@Service
class ServiceEndereco(val repository: RepositoryEndereco) {
    fun createEndereco(request: EnderecoRequest) {
        repository.save(request.toModel())
    }

    fun getById(enderecoId: Long): Endereco {
        return repository.findById(enderecoId).orElseThrow()
    }

}
