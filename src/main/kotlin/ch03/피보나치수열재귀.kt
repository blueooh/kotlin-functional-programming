fun main() {
    println(fiboRecursion(45))
}

fun fiboRecursion(n: Int): Int = when {
    n <= 1 -> n
    else -> fiboRecursion(n - 1) + fiboRecursion(n - 2)
}
