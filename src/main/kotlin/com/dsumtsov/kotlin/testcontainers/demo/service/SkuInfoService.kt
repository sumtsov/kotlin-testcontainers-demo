package com.dsumtsov.kotlin.testcontainers.demo.service

import com.dsumtsov.kotlin.testcontainers.demo.entity.SkuInfo

interface SkuInfoService {

    fun findSkuInfoBySkuId(skuId: Long): SkuInfo

    fun saveSkuInfo(skuInfo: SkuInfo): SkuInfo
}