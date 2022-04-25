package com.example.kypszabablo.domain

interface ShopListRepository {
    fun getShopList (): List<ShopItem>
    fun addNewItem (shopItem: ShopItem)
    fun delateItem(shopItem: ShopItem)
    fun editItem(shopItem: ShopItem)
    fun getItemById(shopItemId : Int) : ShopItem
}