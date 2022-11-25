package com.dsumtsov.kotlin.testcontainers.demo.exception

import java.lang.RuntimeException

class SkuInfoNotFoundException(skuId: Long) : RuntimeException("SKU with SKU ID: $skuId not found")
