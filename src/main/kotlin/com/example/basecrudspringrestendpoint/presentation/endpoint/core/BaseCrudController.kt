package com.example.basecrudspringrestendpoint.presentation.endpoint.core

import com.example.basecrudspringrestendpoint.data.model.core.BaseEntity
import com.example.basecrudspringrestendpoint.presentation.mapper.core.BaseMapper
import com.example.basecrudspringrestendpoint.presentation.dto.core.BaseDto
import com.example.basecrudspringrestendpoint.service.core.BaseCrudService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

abstract class BaseCrudController<Entity : BaseEntity, Id, Dto : BaseDto>(
        private val mapper: BaseMapper<Entity, Dto>)
    : BaseMapper<Entity, Dto> by mapper {

    abstract val service: BaseCrudService<Entity, Id>


    @PostMapping("/save")
    fun save(@RequestBody dto: Dto): ResponseEntity<Dto> {
        val entity = dto.convertToModel()
        val saved = service.save(entity)
        return ResponseEntity.ok(saved.convertToDto())
    }

    @GetMapping("finById")
    fun findById(@RequestParam i: Id): ResponseEntity<Dto?> {
        val entity = service.findById(i)
        return if (entity != null)
            ResponseEntity.ok(entity.convertToDto())
        else
            ResponseEntity.notFound().build()
    }

    @DeleteMapping("delete")
    fun delete(@RequestBody dto: Dto): ResponseEntity<Void> {
        service.delete(dto.convertToModel())
        return ResponseEntity.ok().build()
    }

    @GetMapping("findAll")
    fun findAll(): ResponseEntity<List<Dto>> =
            ResponseEntity.ok(service.findAll().map { it.convertToDto() })
}