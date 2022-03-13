package br.com.exemplo.pessoa.repository

import br.com.exemplo.pessoa.entity.Pessoa
import org.springframework.data.jpa.repository.JpaRepository


interface PessoaRepository : JpaRepository<Pessoa, Long>{

}
