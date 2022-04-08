package com.example.SistemaDeVendasDeAutomoveis.Domain

import javax.persistence.Column

data class ClienteDomain(

    @Column(name = "id_cliente")
    val idCliente: Long,

    @Column(name = "nome")
    val nome:  String,

    @Column(name = "cpf")
    val cpf: String,

    @Column(name = "telefone")
    val telefone: String,

    @Column(name = "email")
    val email: String)