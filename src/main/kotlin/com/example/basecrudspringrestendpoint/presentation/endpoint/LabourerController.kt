package com.example.basecrudspringrestendpoint.presentation.endpoint

import com.example.basecrudspringrestendpoint.data.model.LabourerEntity
import com.example.basecrudspringrestendpoint.presentation.dto.LabourerDto
import com.example.basecrudspringrestendpoint.presentation.endpoint.core.BaseCrudController
import com.example.basecrudspringrestendpoint.presentation.mapper.LabourerMapper
import com.example.basecrudspringrestendpoint.service.LabourerService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/api/v1/labourer")
class LabourerController(val service: LabourerService,
                         mapper: LabourerMapper) : BaseCrudController<LabourerEntity, Long, LabourerDto>(mapper, service) {
    @GetMapping("finByName")
    fun findByName(@RequestParam name: String): ResponseEntity<LabourerDto?> = service.run {
        val entity = findByName(name)
        return if (entity != null)
            ResponseEntity.ok(entity.convertToDto())
        else
            ResponseEntity.notFound().build()
    }
}