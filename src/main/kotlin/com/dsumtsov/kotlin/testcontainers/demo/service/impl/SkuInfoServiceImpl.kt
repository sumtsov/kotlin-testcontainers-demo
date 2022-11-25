package com.dsumtsov.kotlin.testcontainers.demo.service.impl

import com.dsumtsov.kotlin.testcontainers.demo.entity.SkuInfo
import com.dsumtsov.kotlin.testcontainers.demo.exception.SkuInfoNotFoundException
import com.dsumtsov.kotlin.testcontainers.demo.repository.SkuInfoRepository
import com.dsumtsov.kotlin.testcontainers.demo.service.SkuInfoService
import org.springframework.stereotype.Service

@Service
class SkuInfoServiceImpl(
    private val skuInfoRepository: SkuInfoRepository
) : SkuInfoService {

    override fun findSkuInfoBySkuId(skuId: Long): SkuInfo {
        return skuInfoRepository.findBySkuId(skuId)
            ?: throw SkuInfoNotFoundException(skuId)
    }

    override fun saveSkuInfo(skuInfo: SkuInfo): SkuInfo {
        return skuInfoRepository.save(skuInfo)
    }
}