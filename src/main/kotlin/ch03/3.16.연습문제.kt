package ch03

import util.head
import util.tail

fun main() {
    println(tailrecElem(1, listOf(3, 2, 4, 0)))
}

tailrec fun tailrecElem(num: Int, list: List<Int>): Boolean = when {
    list.isEmpty() -> false
    num == list.head() -> true
    else -> tailrecElem(num, list.tail())
}

