package oop_001_ataraxiaaria.week01.UTS_00000148140_AtaraxiaAriaWicaksono

class DrinkMenu(
    name: String,
    menuCode: String,
    basePrice: Double,
    val isLargeSize: Boolean
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        val price = basePrice + if (isLargeSize) 5000.0 else 0.0
        return price * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val size = if (isLargeSize) "Large" else "Regular"
        val subtotal = calculateSubtotal(quantity)

        println("[DRINK] $menuCode - $name ($size)")
        println("  Qty: $quantity cups | Subtotal: ${formatRupiah(subtotal)}")
    }
}