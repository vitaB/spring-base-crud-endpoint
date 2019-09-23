package com.example.basecrudspringrestendpoint.mapper

import com.example.basecrudspringrestendpoint.data.model.LabourerEntity
import com.example.basecrudspringrestendpoint.mapper.core.BaseMapper
import com.example.basecrudspringrestendpoint.presentation.dto.LabourerDto
import org.mapstruct.InheritConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface LabourerMapper : BaseMapper<LabourerEntity, LabourerDto> {

    @Mapping(target = "estrangement", source = "alienation")
    override fun convertToDto(entity: LabourerEntity): LabourerDto

    @InheritConfiguration
    override fun convertToModel(dto: LabourerDto): LabourerEntity
}