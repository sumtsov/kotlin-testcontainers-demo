package com.dsumtsov.kotlin.testcontainers.demo.entity

import javax.persistence.*

@Entity
data class SkuProperty(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var skuInfoId: Long,
    var datamatrix: String?,
    var serialNumber: String?
)
