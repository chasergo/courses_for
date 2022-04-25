package com.example.kypszabablo.domain

class DelateItemUseCase(private val shopListRepository: ShopListRepository) {
    fun delateItem(shopItem: ShopItem){
        shopListRepository.delateItem(shopItem)
    }
}