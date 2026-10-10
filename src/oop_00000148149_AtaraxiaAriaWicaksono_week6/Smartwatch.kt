package oop_001_ataraxiaaria.week01.oop_00000148149_AtaraxiaAriaWicaksono_week6

abstract class Smartwatch: Watch(), BluetoothConnectable, Rechargeable{
    override fun showTime(){
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery(){
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }
}