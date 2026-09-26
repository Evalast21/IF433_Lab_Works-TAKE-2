package oop_001_ataraxiaaria.week01.oop_00000148140_AtaraxiaAriaWicaksono_week05

fun main(){
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 =Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWWAI ===")
    for (pegawai in daftarPegawai){
        pegawai.bekerja()

        when (pegawai){
            is Dosen ->{
                println("-> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin ->{
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("----------------------------")
    }
}