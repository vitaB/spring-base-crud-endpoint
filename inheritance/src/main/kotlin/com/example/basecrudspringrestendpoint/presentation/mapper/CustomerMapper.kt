package com.example.basecrudspringrestendpoint.presentation.mapper

import com.example.basecrudspringrestendpoint.data.model.CustomerEntity
import com.example.basecrudspringrestendpoint.presentation.mapper.core.BaseMapper
import com.example.basecrudspringrestendpoint.presentation.dto.CustomerDto
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface CustomerMapper : BaseMapper<CustomerEntity, CustomerDto>