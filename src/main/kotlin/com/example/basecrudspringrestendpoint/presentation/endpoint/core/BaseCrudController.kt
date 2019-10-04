package com.example.basecrudspringrestendpoint.presentation.endpoint.core

import com.example.basecrudspringrestendpoint.data.model.core.BaseEntity
import com.example.basecrudspringrestendpoint.presentation.mapper.core.BaseMapper
import com.example.basecrudspringrestendpoint.presentation.dto.core.BaseDto
import com.example.basecrudspringrestendpoint.service.core.BaseCrudService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

abstract class BaseCrudController<Entity : BaseEntity, Id, Dto : BaseDto> {

    abstract val service: BaseCrudService<Entity, Id>

    abstract val mapper: BaseMapper<Entity, Dto>


    @PostMapping("/save")
    fun save(@RequestBody dto: Dto): ResponseEntity<Dto> = mapper.run {
        val entity = dto.convertToModel()
        val saved = service.save(entity)
        return ResponseEntity.ok(saved.convertToDto())
    }

    @GetMapping("finById")
    fun findById(@RequestParam i: Id): ResponseEntity<Dto?> = mapper.run {
        val entity = service.findById(i)
        return if (entity != null)
            ResponseEntity.ok(entity.convertToDto())
        else
            ResponseEntity.notFound().build()
    }

    @DeleteMapping("delete")
    fun delete(@RequestBody dto: Dto): ResponseEntity<Void> = mapper.run {
        service.delete(dto.convertToModel())
        return ResponseEntity.ok().build()
    }

    @GetMapping("findAll")
    fun findAll(): ResponseEntity<List<Dto>> = mapper.run {
        ResponseEntity.ok(service.findAll().map { it.convertToDto() })
    }
}