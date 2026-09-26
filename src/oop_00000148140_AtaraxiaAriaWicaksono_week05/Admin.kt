package oop_001_ataraxiaaria.week01.oop_00000148140_AtaraxiaAriaWicaksono_week05

class Admin(nama: String) : Pegawai(nama){
    override fun bekerja(){
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }

    fun doAdminWork(){
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}