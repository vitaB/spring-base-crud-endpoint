package com.example.basecrudspringrestendpoint.data.model.core

import javax.persistence.*
import javax.persistence.GenerationType
import javax.persistence.GeneratedValue


@Entity
abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null

    @Version
    var version: Int = 0
}