package com.example.basecrudspringrestendpoint.data.repo

import com.example.basecrudspringrestendpoint.data.model.CustomerEntity
import com.example.basecrudspringrestendpoint.data.repo.core.BaseRepo
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepo : BaseRepo<CustomerEntity, Long>