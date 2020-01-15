package com.example.basecrudspringrestendpoint.data.model

import com.example.basecrudspringrestendpoint.data.model.core.BaseEntity
import javax.persistence.Entity

@Entity
data class CustomerEntity(var name: String?, var accountNumber: String?) : BaseEntity() {
    @Deprecated("empty constructor and mutable variables are necessary for MapStruct")
    constructor() : this(null, null)
}