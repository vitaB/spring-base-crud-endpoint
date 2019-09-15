package com.example.basecrudspringrestendpoint.data.repo.core

import com.example.basecrudspringrestendpoint.data.model.core.BaseEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface BaseRepo<Entity: BaseEntity, Id>: CrudRepository<Entity, Id>