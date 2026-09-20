package oop_001_ataraxiaaria.week01.oop_00000148140_AtaraxiaAriaWicaksono_week04

class Car {
    open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

        fun openTrunk(){
            println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka. ")
        }
    }
}