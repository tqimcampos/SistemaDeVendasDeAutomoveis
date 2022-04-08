package com.example.SistemaDeVendasDeAutomoveis.Controller

import com.example.SistemaDeVendasDeAutomoveis.Domain.ClienteDomain
import com.example.SistemaDeVendasDeAutomoveis.Repository.ClienteRepository
import com.example.SistemaDeVendasDeAutomoveis.Request.ClienteRequest
import com.example.SistemaDeVendasDeAutomoveis.Response.ClientResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("cliente")
class ClienteController(val repository: ClienteRepository) {

    @PostMapping
    fun create (@RequestBody clienteDomain: ClienteDomain) = ResponseEntity.ok(repository.save(clienteDomain))
     //Ainda falta verirficar algumas paradas para melhorar, vou fazer no fim de semana

    //return ResponseEntity.status(HttpStatus.CREATED)

    @GetMapping
    fun search() = ResponseEntity.status(HttpStatus.OK)

    @PutMapping("(/id)")
    fun update(@PathVariable idCliente: Long, @RequestBody clienteDomain : ClienteDomain): ResponseEntity<ClienteDomain> {

        val findByCliente = repository.findByidCliente(idCliente)
        findByCliente.orElseThrow { RuntimeException("Cliente $idCliente não encontrado") }
        val save = repository.save(clienteDomain.copy(
            nome = clienteDomain.nome, cpf = clienteDomain.cpf,
            telefone = clienteDomain.telefone, email = clienteDomain.email))

        return ResponseEntity.ok(save)
    }



}






