package oop_001_ataraxiaaria.week01.UTS_00000148140_AtaraxiaAriaWicaksono

import java.text.NumberFormat
import java.util.Locale

fun formatRupiah(amount: Double): String {
    val formatter = NumberFormat.getNumberInstance(
        Locale("id", "ID")
    )
    formatter.maximumFractionDigits = 0
    formatter.minimumFractionDigits = 0

    return "Rp ${formatter.format(amount)}"
}

class CateringOrder(
    val customer: Customer
) {
    var status: OrderStatus = OrderStatus.WAITING_LIST

    private val orderItems: MutableList<Pair<CateringMenu, Int>> =
        mutableListOf()

    fun addMenuToOrder(menu: CateringMenu, qty: Int) {
        orderItems.add(Pair(menu, qty))
    }

    fun printInvoice() {
        var grandTotal = 0.0

        println()
        println("================ INVOICE ================")
        println("Customer: ${customer.name} (${customer.phone})")
        println("Delivery Address: ${customer.deliveryAddress}")
        println()
        println("Order Status: $status")
        println()

        orderItems.forEachIndexed { index, item ->
            val (menu, quantity) = item

            print("${index + 1}. ")
            menu.printMenuDetails(quantity)

            grandTotal += menu.calculateSubtotal(quantity)
            println()
        }

        println("-----------------------------------------")
        println("GRAND TOTAL: ${formatRupiah(grandTotal)}")
        println("=========================================")
    }
}