package com.example.basecrudspringrestendpoint.presentation.dto

import com.example.basecrudspringrestendpoint.presentation.dto.core.BaseDto

data class CustomerDto(var name: String?, var accountNumber: String?) : BaseDto() {
    @Deprecated("empty constructor and mutable variables are necessary for MapStruct")
    constructor() : this(null, null)
}