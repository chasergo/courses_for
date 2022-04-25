package com.example.kypszabablo.domain

class EditItemUseCase(private val shopListRepository: ShopListRepository) {
    fun editItem(shopItem: ShopItem){
        shopListRepository.editItem(shopItem)
    }
}