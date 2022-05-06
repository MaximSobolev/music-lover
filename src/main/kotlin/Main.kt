fun main() {
    val price = 5000_00

    val firstDiscount = 100_00
    val secondDiscount = (price * 0.05).toInt()

    val musicLover = false

    var discountPrice : Int

    if (price > 1000_00 && price < 10000_00) {
        discountPrice = price - firstDiscount
    } else if (price > 10000_00) {
        discountPrice = price - secondDiscount
    } else {
        discountPrice = price
    }

    val totalPrice = if (musicLover) (discountPrice * 0.99).toInt() else discountPrice

    println(totalPrice)
}