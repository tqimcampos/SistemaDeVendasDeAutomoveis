package com.example.SistemaDeVendasDeAutomoveis.Repository

import com.example.SistemaDeVendasDeAutomoveis.Domain.ClienteDomain
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ClienteRepository : JpaRepository<ClienteDomain, Long>{

    fun findByidCliente (idCliente: Long): Optional<ClienteDomain>
}