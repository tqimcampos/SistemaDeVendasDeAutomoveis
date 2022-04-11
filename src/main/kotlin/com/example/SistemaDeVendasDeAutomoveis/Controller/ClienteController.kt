package com.example.SistemaDeVendasDeAutomoveis.Controller

import com.example.SistemaDeVendasDeAutomoveis.Domain.ClienteDomain
import com.example.SistemaDeVendasDeAutomoveis.Repository.ClienteRepository

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("cliente")
class ClienteController(val repository: ClienteRepository) {

    @PostMapping
    fun created(@RequestBody clienteDomain: ClienteDomain): ClienteDomain = repository.save(clienteDomain)

    @GetMapping
    fun search() : List<ClienteDomain> = repository.findAll()

    @GetMapping("/{id}")
    fun searchById(@PathVariable idCliente: Long) : ResponseEntity<ClienteDomain> =
        repository.findByidCliente(idCliente).map {
            ResponseEntity.ok(it)
        }.orElse(ResponseEntity.notFound().build())

    @PutMapping("/{id}")
    fun upadate(@PathVariable idCliente: Long, @RequestBody clienteDomain: ClienteDomain) : ResponseEntity<ClienteDomain> =
        repository.findByidCliente(idCliente).map {
            val clienteUpdate = it.copy(
                nome = clienteDomain.nome,
                telefone = clienteDomain.telefone,
                cpf = clienteDomain.cpf,
                email = clienteDomain.email
            )
            ResponseEntity.ok(repository.save(clienteUpdate))
        }.orElse(ResponseEntity.notFound().build())

    @DeleteMapping("/{id}")
    fun delete(@PathVariable idCliente: Long) : ResponseEntity<Void> =
        repository.findByidCliente(idCliente).map {
            repository.delete(it)
            ResponseEntity<Void>(HttpStatus.OK)
        }.orElse(ResponseEntity.notFound().build())

}






