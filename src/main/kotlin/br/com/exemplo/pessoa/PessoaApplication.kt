package br.com.exemplo.pessoa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PessoaApplication

fun main(args: Array<String>) {
	runApplication<PessoaApplication>(*args)
}
