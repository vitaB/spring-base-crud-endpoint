package com.example.basecrudspringrestendpoint.service.core

import com.example.basecrudspringrestendpoint.data.model.core.BaseEntity
import com.example.basecrudspringrestendpoint.data.repo.core.BaseRepo

abstract class BaseCrudService<Entity : BaseEntity> {

    abstract val repo: BaseRepo<Entity, *>

    fun save(entity: Entity): Entity {
        return repo.save(entity)
    }

    fun findAll(): List<Entity> {
        return repo.findAll().toList()
    }
}