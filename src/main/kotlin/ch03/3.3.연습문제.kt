fun main() {
    println(factorial(0))
    println(factorial(1))
    println(factorial(2))
    println(factorial(3))
    println(factorial(10))
}

fun factorial(n: Int): Int = when(n) {
    0 -> 1
    else -> n * factorial(n - 1)
}