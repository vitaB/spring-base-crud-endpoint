package com.example.basecrudspringrestendpoint.service.core

import com.example.basecrudspringrestendpoint.data.model.core.BaseEntity
import com.example.basecrudspringrestendpoint.data.repo.core.BaseRepo
import org.springframework.data.repository.findByIdOrNull

abstract class BaseCrudService<Entity : BaseEntity, Id> {

    abstract val repo: BaseRepo<Entity, Id>

    fun save(entity: Entity): Entity =
            repo.save(entity)

    fun findById(i: Id): Entity? =
            repo.findByIdOrNull(i)

    fun findAll(): List<Entity> =
            repo.findAll().toList()

    fun delete(entity: Entity) {
        repo.delete(entity)
    }
}