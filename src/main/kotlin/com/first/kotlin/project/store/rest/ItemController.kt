package com.first.kotlin.project.store.rest

import com.first.kotlin.project.store.dto.ItemDto
import com.first.kotlin.project.store.entities.Item
import com.first.kotlin.project.store.service.ItemService
import lombok.extern.slf4j.Slf4j

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/items")
@Slf4j
class ItemController(
    @Autowired val itemService: ItemService
) {

    @GetMapping
    fun getItems(): List<ItemDto> {
        return itemService.getAllItems();
    }

    @PostMapping
    fun addItem(itemDto: ItemDto) {
        println("endpoint add item reached")
        println(itemDto.price)
        itemService.addItem(Item(itemDto.title!!, itemDto.description!!, itemDto.price))
    }
}