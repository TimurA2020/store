package com.first.kotlin.project.store.service

import com.first.kotlin.project.store.dto.ItemDto
import com.first.kotlin.project.store.entities.Item
import com.first.kotlin.project.store.mapper.ItemMapper
import com.first.kotlin.project.store.repo.ItemRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ItemService(
    @Autowired private val itemRepo: ItemRepo,
    @Autowired private val itemMapper: ItemMapper) {

    fun getAllItems() :List<ItemDto> {
        return itemMapper.toDtoList(itemRepo.findAll());
    }

}