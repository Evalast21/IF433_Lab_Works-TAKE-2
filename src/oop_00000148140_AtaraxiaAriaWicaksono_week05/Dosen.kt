package oop_001_ataraxiaaria.week01.oop_00000148140_AtaraxiaAriaWicaksono_week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama){
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    fun mengajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}