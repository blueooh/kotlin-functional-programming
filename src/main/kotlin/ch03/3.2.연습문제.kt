fun main() {
    println( power(2.0, 2))
}

fun power(x: Double, n: Int): Double =
    when(n) {
        0 -> 1.0
        1 -> x
        else -> x * power(x, n - 1)
    }