package com.dsumtsov.kotlin.testcontainers.demo.repository

import com.dsumtsov.kotlin.testcontainers.demo.entity.SkuInfo
import org.springframework.data.jpa.repository.JpaRepository

interface SkuInfoRepository : JpaRepository<SkuInfo, Long> {

    fun findBySkuId(skuId: Long): SkuInfo?
}
