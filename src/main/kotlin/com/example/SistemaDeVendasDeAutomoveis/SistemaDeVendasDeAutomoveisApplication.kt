package com.example.SistemaDeVendasDeAutomoveis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SistemaDeVendasDeAutomoveisApplication

@Bean
fun main(args: Array<String>) {
	runApplication<SistemaDeVendasDeAutomoveisApplication>(*args)
}
