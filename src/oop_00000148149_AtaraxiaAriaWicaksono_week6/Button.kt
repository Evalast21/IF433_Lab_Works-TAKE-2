package oop_001_ataraxiaaria.week01.oop_00000148149_AtaraxiaAriaWicaksono_week6

class Button(override val name: String) : Clickable{
    override  fun click(){
        println("Tombol '$name' berhasil diklik!")
    }
}