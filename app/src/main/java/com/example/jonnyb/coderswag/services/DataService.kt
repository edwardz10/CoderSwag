package com.example.jonnyb.coderswag.services

import com.example.jonnyb.coderswag.model.Category
import com.example.jonnyb.coderswag.model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat White", "$20", "hat2"),
        Product("Devslopes Hat Black", "$18", "hat3"),
        Product("Devslopes Hap Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$18", "hoodie1"),
        Product("Devslopes Hoodie Red", "$20", "hoodie2"),
        Product("Devslopes Gray Hoodie", "$18", "hoodie3"),
        Product("Devslopes Black Hoodie", "$22", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt1"),
        Product("Devslopes Badge Light Gray", "$20", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
        Product("Devslopes Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )
}