package com.example.basecrudspringrestendpoint.mapper

import com.example.basecrudspringrestendpoint.data.model.CustomerEntity
import com.example.basecrudspringrestendpoint.mapper.core.BaseMapper
import com.example.basecrudspringrestendpoint.presentation.dto.CustomerDto
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface CustomerMapper: BaseMapper<CustomerEntity, CustomerDto>