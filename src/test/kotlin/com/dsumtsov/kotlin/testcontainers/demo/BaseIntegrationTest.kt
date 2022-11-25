package com.dsumtsov.kotlin.testcontainers.demo

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.DynamicPropertyRegistry
import org.springframework.test.context.DynamicPropertySource
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.junit.jupiter.Testcontainers

@Testcontainers
@SpringBootTest
class BaseIntegrationTest {

    companion object {

        private val postgreSQLContainer = PostgreSQLContainer<Nothing>("postgres:12:8").apply {
            withInitScript("sql/init.sql")
            withReuse(true)
        }

        init {
            postgreSQLContainer.start()
        }

        @JvmStatic
        @DynamicPropertySource
        fun testProperties(registry: DynamicPropertyRegistry) {
            registry.add("spring.datasource.url", postgreSQLContainer::getJdbcUrl)
            registry.add("spring.datasource.username", postgreSQLContainer::getUsername)
            registry.add("spring.datasource.password", postgreSQLContainer::getPassword)
        }
    }
}