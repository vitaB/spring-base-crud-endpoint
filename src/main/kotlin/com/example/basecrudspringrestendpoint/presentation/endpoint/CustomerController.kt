package com.example.basecrudspringrestendpoint.presentation.endpoint

import com.example.basecrudspringrestendpoint.data.model.CustomerEntity
import com.example.basecrudspringrestendpoint.presentation.mapper.CustomerMapperImpl
import com.example.basecrudspringrestendpoint.presentation.dto.CustomerDto
import com.example.basecrudspringrestendpoint.presentation.endpoint.core.BaseCrudController
import com.example.basecrudspringrestendpoint.service.CustomerService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/api/v1/customer")
class CustomerController(override val service: CustomerService,
                         override val mapper: CustomerMapperImpl) : BaseCrudController<CustomerEntity, Long, CustomerDto>()