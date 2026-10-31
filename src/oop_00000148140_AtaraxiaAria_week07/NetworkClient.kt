package oop_001_ataraxiaaria.week01.oop_00000148140_AtaraxiaAria_week07

class NetworkClient private constructor(val url: String) {

    fun connect() {
        println("Menghubungkan ke $url")
    }

}