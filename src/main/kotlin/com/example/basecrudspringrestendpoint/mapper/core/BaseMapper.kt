package com.example.basecrudspringrestendpoint.mapper.core

import com.example.basecrudspringrestendpoint.data.model.core.BaseEntity
import com.example.basecrudspringrestendpoint.presentation.dto.core.BaseDto


interface BaseMapper<Entity: BaseEntity, Dto: BaseDto> {

    fun convertToDto(entity: Entity) : Dto

    fun convertToModel(dto: Dto) : Entity
}