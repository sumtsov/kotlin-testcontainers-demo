package com.dsumtsov.kotlin.testcontainers.demo.entity

import javax.persistence.*

@Entity
data class SkuInfo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var skuId: Long,

    @OneToMany(
        mappedBy = "skuInfoId",
        fetch = FetchType.EAGER
    )
    val skuProperties: MutableList<SkuProperty>
)
