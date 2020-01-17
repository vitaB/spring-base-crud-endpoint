package com.example.basecrudspringrestendpoint.service.core

import com.example.basecrudspringrestendpoint.data.model.core.BaseEntity
import com.example.basecrudspringrestendpoint.data.repo.core.BaseRepo
import org.springframework.data.repository.findByIdOrNull

interface BaseCrudService<Entity : BaseEntity, Id>  {
    val repo: BaseRepo<Entity, Id>

    fun Entity.save(): Entity =
            repo.save(this)

    fun findById(i: Id): Entity? =
            repo.findByIdOrNull(i)

    fun findAll(): List<Entity> =
            repo.findAll().toList()

    fun Entity.delete() {
        repo.delete(this)
    }
}