import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- MINI RPG BATTLE ---")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(
        name = heroName,
        baseDamage = baseDamage
    )

    var enemyHp = 100

    println()
    println("Hero ${hero.name} siap bertarung!")
    println("HP Hero: ${hero.hp}")
    println("HP Enemy: $enemyHp")

    while (hero.isAlive() && enemyHp > 0) {

        println()
        println("=== MENU ===")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih: ")

        val choice = scanner.nextInt()

        if (choice == 1) {

            hero.attack("Enemy")

            enemyHp -= hero.baseDamage

            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("HP Enemy tersisa: $enemyHp")

            if (enemyHp > 0) {

                val enemyDamage = (10..20).random()

                println("Enemy menyerang balik!")
                println("Enemy memberikan $enemyDamage damage.")

                hero.takeDamage(enemyDamage)

                println("HP Hero tersisa: ${hero.hp}")
            }

        } else if (choice == 2) {

            println("${hero.name} memilih untuk kabur!")
            break

        } else {
            println("Pilihan tidak valid!")
        }
    }

    println()
    println("=== HASIL PERTARUNGAN ===")

    if (hero.hp > 0 && enemyHp <= 0) {
        println("${hero.name} menang!")
    } else if (hero.hp <= 0) {
        println("${hero.name} kalah!")
    } else {
        println("${hero.name} kabur dari pertarungan.")
    }
}