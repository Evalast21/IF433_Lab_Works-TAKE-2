package oop_001_ataraxiaaria.week01.oop_00000148140_AtaraxiaAria_week07

fun main() {

    DatabaseManager.connect()

    val client = NetworkClient.create("https://api.umn.ac.id")

    client.connect()

    DatabaseManager.disconnect()

}