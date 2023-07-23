package com.first.kotlin.project.store.mapper

import com.first.kotlin.project.store.dto.ItemDto
import com.first.kotlin.project.store.entities.Item
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ItemMapper {

    fun toDto(item: Item) : ItemDto

    fun toItem(itemDto: ItemDto): Item

    fun toDtoList(itemList: List<Item>): List<ItemDto>
}