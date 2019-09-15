package com.example.basecrudspringrestendpoint

import com.example.basecrudspringrestendpoint.data.repo.core.BaseRepo
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.FilterType
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
class BaseCrudSpringRestEndpointApplication

fun main(args: Array<String>) {
	runApplication<BaseCrudSpringRestEndpointApplication>(*args)
}
