package oop_001_ataraxiaaria.week01.oop_00000148140_ataraxiaaria.week08

class NotificationService {

    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {

        // sendEmail(user.email) // Type mismatch

        if (user.email != null) {
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}