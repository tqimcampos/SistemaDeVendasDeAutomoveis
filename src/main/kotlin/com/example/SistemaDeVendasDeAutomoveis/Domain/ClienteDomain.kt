package com.example.SistemaDeVendasDeAutomoveis.Domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class ClienteDomain(

    @Id
    @GeneratedValue
    @Column(name = "idCliente")
    val idCliente: Long,

    @Column(name = "nome")
    val nome: String,

    @Column(name = "cpf")
    val cpf: String,

    @Column(name = "telefone")
    val telefone: String,

    @Column(name = "email")
    val email: String

)