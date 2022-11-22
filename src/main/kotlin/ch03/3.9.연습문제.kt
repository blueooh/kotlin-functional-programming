package ch03

fun main() {
    println(gcd(12, 7))
}

fun gcd(m: Int, n: Int): Int = when {
    n == 0 -> m
    else -> gcd(n, m%n)
}
