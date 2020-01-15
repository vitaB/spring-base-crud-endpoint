package com.example.basecrudspringrestendpoint.presentation.endpoint.core

import com.example.basecrudspringrestendpoint.data.model.core.BaseEntity
import com.example.basecrudspringrestendpoint.presentation.mapper.core.BaseMapper
import com.example.basecrudspringrestendpoint.presentation.dto.core.BaseDto
import com.example.basecrudspringrestendpoint.service.core.BaseCrudService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


abstract class BaseCrudController<Entity : BaseEntity, Id, Dto : BaseDto>(
        mapper: BaseMapper<Entity, Dto>,
        service: BaseCrudService<Entity, Id>)
    : BaseMapper<Entity, Dto> by mapper
        , BaseCrudService<Entity, Id> by service {


    @PostMapping("/save")
    fun saveDto(@RequestBody dto: Dto): ResponseEntity<Dto> {
        val saved = dto.convertToModel().save()
        return ResponseEntity.ok(saved.convertToDto())
    }

    @GetMapping("finById")
    fun findDtoById(@RequestParam i: Id): ResponseEntity<Dto?> {
        val entity = findById(i)
        return if (entity != null)
            ResponseEntity.ok(entity.convertToDto())
        else
            ResponseEntity.notFound().build()
    }

    @DeleteMapping("delete")
    fun deleteDto(@RequestBody dto: Dto): ResponseEntity<Void> {
        dto.convertToModel().delete()
        return ResponseEntity.ok().build()
    }

    @GetMapping("findAll")
    fun findAllDtos(): ResponseEntity<List<Dto>> =
            ResponseEntity.ok(findAll().map { it.convertToDto() })
}