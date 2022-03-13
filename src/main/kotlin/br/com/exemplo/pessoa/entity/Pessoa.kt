package br.com.exemplo.pessoa.entity

import javax.persistence.*

@Entity
data class Pessoa(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val name: String,

    @OneToOne
    @JoinColumn(name = "endereco_id")
    val endereco: Endereco
)