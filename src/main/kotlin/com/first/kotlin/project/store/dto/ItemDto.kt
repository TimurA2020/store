package com.first.kotlin.project.store.dto

import com.fasterxml.jackson.databind.BeanDescription
import java.util.DoubleSummaryStatistics

class ItemDto(
    val id: Long,
    val title: String,
    val description: String,
    val price: Double
) {
}