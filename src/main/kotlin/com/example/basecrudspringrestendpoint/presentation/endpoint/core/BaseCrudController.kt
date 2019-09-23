package com.example.basecrudspringrestendpoint.presentation.endpoint.core

import com.example.basecrudspringrestendpoint.data.model.core.BaseEntity
import com.example.basecrudspringrestendpoint.mapper.core.BaseMapper
import com.example.basecrudspringrestendpoint.presentation.dto.core.BaseDto
import com.example.basecrudspringrestendpoint.service.core.BaseCrudService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

abstract class BaseCrudController<Entity : BaseEntity, Dto : BaseDto> {

    abstract val service: BaseCrudService<Entity>

    abstract val mapper: BaseMapper<Entity, Dto>


    @PostMapping("/save")
    fun save(@RequestBody customer: Dto): ResponseEntity<Dto> {
        val entity = mapper.convertToModel(customer)
        val saved = service.save(entity)
        return ResponseEntity.ok(mapper.convertToDto(saved))
    }

    @GetMapping("findAll")
    fun findAll(): ResponseEntity<List<Dto>> {
        return ResponseEntity.ok(service.findAll().map { mapper.convertToDto(it) })
    }
}