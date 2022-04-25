package com.example.kypszabablo.domain

class AddNewItemUseCase(private val shopListRepository: ShopListRepository) {
    fun addNewItem (shopItem: ShopItem) {
        shopListRepository.addNewItem(shopItem)
    }
}