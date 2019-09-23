package com.example.basecrudspringrestendpoint.service

import com.example.basecrudspringrestendpoint.data.model.LabourerEntity
import com.example.basecrudspringrestendpoint.data.repo.LabourerRepo
import com.example.basecrudspringrestendpoint.service.core.BaseCrudService
import org.springframework.stereotype.Service

@Service
class LabourerService(override val repo: LabourerRepo) : BaseCrudService<LabourerEntity>()