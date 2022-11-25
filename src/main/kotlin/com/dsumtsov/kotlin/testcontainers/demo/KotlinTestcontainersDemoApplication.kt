package com.dsumtsov.kotlin.testcontainers.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinTestcontainersDemoApplication

fun main(args: Array<String>) {
    runApplication<KotlinTestcontainersDemoApplication>(*args)
}
