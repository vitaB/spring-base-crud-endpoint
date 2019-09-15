package com.example.basecrudspringrestendpoint.service

import com.example.basecrudspringrestendpoint.data.model.CustomerEntity
import com.example.basecrudspringrestendpoint.data.repo.CustomerRepo
import com.example.basecrudspringrestendpoint.service.core.BaseCrudService
import org.springframework.stereotype.Service

@Service
class CustomerService(override val repo: CustomerRepo): BaseCrudService<CustomerEntity>()