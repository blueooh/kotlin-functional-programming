package ch03

fun main() {
   repeat(10).take(5).forEach { println(it) }
}

fun repeat(n: Int): Sequence<Int> = generateSequence(n) { it }
