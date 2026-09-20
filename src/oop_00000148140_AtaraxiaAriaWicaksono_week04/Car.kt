package oop_001_ataraxiaaria.week01.oop_00000148140_AtaraxiaAriaWicaksono_week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

        fun openTrunk(){
            println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka. ")
        }
    }

class ToyotaCar(numberOfDoors: Int) : Car(brand = "Toyota", numberOfDoors = numberOfDoors) {
    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}
