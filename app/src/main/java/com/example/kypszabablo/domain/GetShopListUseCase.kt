package com.example.kypszabablo.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList (): List<ShopItem>{
        return rn shopListRepository.getShopList()
    }
}