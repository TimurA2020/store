package com.first.kotlin.project.store.service

import com.first.kotlin.project.store.dto.ItemDto
import com.first.kotlin.project.store.entities.Item
import com.first.kotlin.project.store.repo.ItemRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ItemService(
    @Autowired private val itemRepo: ItemRepo,
) {

    fun getAllItems() :List<ItemDto> {
        val list: MutableList<ItemDto> = ArrayList()
        itemRepo.findAll().forEach { list.add(it.toDto()) }
        return list
    }

    fun addItem(item: Item) {
        itemRepo.save(item)
    }
}