package oop_001_ataraxiaaria.week01.oop_00000148140_ataraxiaaria.week09

fun main() {

    println("=== LIST COLLECTIONS ===")

    val readOnlyFruits = listOf("Apple", "Banana", "Cherry")

    println("Read Only List: $readOnlyFruits")

    val shoppingCart = mutableListOf("Laptop", "Mouse")

    shoppingCart.add("Keyboard")
    shoppingCart.remove("Mouse")

    println("Mutable List: $shoppingCart")

    println("\n=== TEST SET ===")

    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("Active Users: $activeUsers")
}