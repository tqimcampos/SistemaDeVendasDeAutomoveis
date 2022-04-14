package com.example.SistemaDeVendasDeAutomoveis.Request

data class ClienteRequest(

   val idCliente: Long,
   val nome: String,
   val cpf: String,
   val email: String,
   val telefone: String
   )



