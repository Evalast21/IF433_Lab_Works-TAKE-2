package oop_001_ataraxiaaria.week01.oop_00000148140_ataraxiaaria.week09

fun main() {

    println("=== LIST COLLECTIONS ===")

    val readOnlyFruits = listOf("Apple", "Banana", "Cherry")

    println("Read Only List: $readOnlyFruits")

    val shoppingCart = mutableListOf("Laptop", "Mouse")

    shoppingCart.add("Keyboard")
    shoppingCart.remove("Mouse")

    println("Mutable List: $shoppingCart")
}