package com.first.kotlin.project.store.dto

import com.fasterxml.jackson.databind.BeanDescription
import com.first.kotlin.project.store.entities.Item
import lombok.NoArgsConstructor
import java.util.DoubleSummaryStatistics

data class ItemDto(
    val title: String? = "",
    val description: String? = "",
    val price: Double = 0.0
) {

    fun toEntity(): Item {
        return Item(this.title!!, this.description!!, this.price)
    }
}