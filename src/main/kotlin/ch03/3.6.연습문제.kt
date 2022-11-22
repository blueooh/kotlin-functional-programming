package ch03

import util.head
import util.tail

fun main() {
    println(elem(1, listOf(3, 2, 4, 0)))
}

fun elem(num: Int, list: List<Int>): Boolean = when {
    list.isEmpty() -> false
    num == list.head() -> true
    else -> elem(num, list.tail())
}

