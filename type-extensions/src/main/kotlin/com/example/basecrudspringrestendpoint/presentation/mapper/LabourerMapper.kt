package com.example.basecrudspringrestendpoint.presentation.mapper

import com.example.basecrudspringrestendpoint.data.model.LabourerEntity
import com.example.basecrudspringrestendpoint.presentation.mapper.core.BaseMapper
import com.example.basecrudspringrestendpoint.presentation.dto.LabourerDto
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface LabourerMapper : BaseMapper<LabourerEntity, LabourerDto> {

    @Mapping(target = "estrangement", source = "alienation")
    override fun LabourerEntity.convertToDto(): LabourerDto

    @InheritInverseConfiguration
    override fun LabourerDto.convertToModel(): LabourerEntity
}