package com.okta.kotlin.resourceserver

import com.okta.kotlin.resourceserver.gateway.repository.CoffeeShopRepository
import com.okta.kotlin.resourceserver.model.CoffeeShop
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.math.BigDecimal

@SpringBootApplication
class ResourceserverApplication {
	@Bean
	fun run(repository: CoffeeShopRepository) = ApplicationRunner {
		repository.save(CoffeeShop(
				name = "Estrela Livros",
				address = "Rua dos palmares",
				coffeePrice = BigDecimal.TEN
		))
	}
}

fun main(args: Array<String>) {
	runApplication<ResourceserverApplication>(*args)
}
