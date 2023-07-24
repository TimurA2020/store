package com.first.kotlin.project.store.entities

import com.first.kotlin.project.store.dto.ItemDto
import jakarta.persistence.*
import lombok.Getter
import lombok.Setter
import java.math.BigDecimal

@Entity
@Table(name = "t_items")
class Item (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    private val title: String = "",

    private val description: String = "",

    private val price: Double = 0.0
) {

    constructor(title: String, description: String, price: Double) : this(0, title, description, price)


    fun toDto(): ItemDto {
        return ItemDto(this.title, this.description, this.price)
    }

}