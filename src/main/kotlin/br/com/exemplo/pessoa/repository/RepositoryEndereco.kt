package br.com.exemplo.pessoa.repository

import br.com.exemplo.pessoa.entity.Endereco
import org.springframework.data.jpa.repository.JpaRepository

interface RepositoryEndereco : JpaRepository<Endereco, Long> {

}
