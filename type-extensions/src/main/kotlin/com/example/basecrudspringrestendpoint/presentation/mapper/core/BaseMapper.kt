package com.example.basecrudspringrestendpoint.presentation.mapper.core

import com.example.basecrudspringrestendpoint.data.model.core.BaseEntity
import com.example.basecrudspringrestendpoint.presentation.dto.core.BaseDto


interface BaseMapper<Entity : BaseEntity, Dto : BaseDto> {

    fun Entity.convertToDto(): Dto

    fun Dto.convertToModel(): Entity
}