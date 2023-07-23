package com.first.kotlin.project.store.repo

import com.first.kotlin.project.store.entities.Item
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemRepo: JpaRepository<Item, Long> {
}