package com.example.basecrudspringrestendpoint.data.repo

import com.example.basecrudspringrestendpoint.data.model.LabourerEntity
import com.example.basecrudspringrestendpoint.data.repo.core.BaseRepo
import org.springframework.stereotype.Repository

@Repository
interface LabourerRepo : BaseRepo<LabourerEntity, Long>