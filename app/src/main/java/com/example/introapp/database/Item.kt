package com.example.introapp.database

data class Item(
    val id: Int = 0,
    val itemName: String,
    val itemPrice: Double,
    val quantityInStock: Int
)