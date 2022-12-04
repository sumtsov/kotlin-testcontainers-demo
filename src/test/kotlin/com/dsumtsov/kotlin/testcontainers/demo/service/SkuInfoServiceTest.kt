package com.dsumtsov.kotlin.testcontainers.demo.service

import com.dsumtsov.kotlin.testcontainers.demo.IntegrationTestBase
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.jdbc.Sql

@Sql(
    "classpath:sql/delete-test-data.sql",
    "classpath:sql/create-test-data.sql"
)
class SkuInfoServiceTest : IntegrationTestBase() {

    @Autowired
    private lateinit var skuInfoService: SkuInfoService

    @Test
    fun testFindSkuInfoBySkuId() {
        val skuInfo = skuInfoService.findSkuInfoBySkuId(1)

        Assertions.assertEquals(1, skuInfo.id)
        Assertions.assertEquals(1, skuInfo.skuId)
        Assertions.assertEquals(1, skuInfo.skuId)
        Assertions.assertEquals("abcd1234", skuInfo.skuProperties[0].datamatrix)
        Assertions.assertEquals("BA-123456-2022", skuInfo.skuProperties[0].serialNumber)
    }
}