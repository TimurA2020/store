package com.first.kotlin.project.store.entities

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "t_items")
class Item (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val title: String = "",

    val description: String = "",

    val price: Double = 0.0
)