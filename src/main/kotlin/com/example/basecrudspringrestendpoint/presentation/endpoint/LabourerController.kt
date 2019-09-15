package com.example.basecrudspringrestendpoint.presentation.endpoint

import com.example.basecrudspringrestendpoint.data.model.LabourerEntity
import com.example.basecrudspringrestendpoint.mapper.LabourerMapperImpl
import com.example.basecrudspringrestendpoint.presentation.dto.LabourerDto
import com.example.basecrudspringrestendpoint.presentation.endpoint.core.BaseCrudController
import com.example.basecrudspringrestendpoint.service.LabourerService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/api/v1/labourer")
class LabourerController(override val service: LabourerService,
                         override val mapper: LabourerMapperImpl) : BaseCrudController<LabourerEntity, LabourerDto>() {
}