package oop_001_ataraxiaaria.week01.oop_00000148140_ataraxiaaria.week07

object DatabaseManager{
    var connectionStatus: String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected to Server"
        println("Database is ready")
    }
}