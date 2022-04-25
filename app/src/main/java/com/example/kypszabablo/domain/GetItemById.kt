package com.example.kypszabablo.domain

class GetItemById(private val shopListRepository: ShopListRepository) {
    fun getItemById(shopItemId : Int) : ShopItem{
        shopListRepository.getItemById(shopItemId)
    }
}