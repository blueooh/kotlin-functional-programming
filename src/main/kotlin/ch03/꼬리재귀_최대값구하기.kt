package ch03

import util.head
import util.tail

fun main() {
    println(tailrecMaximum(listOf(1, 2, 3, 90, 4, 5, 6, 7, 100, 80)))
}

tailrec fun tailrecMaximum(list: List<Int>, acc: Int = Int.MIN_VALUE): Int = when {
    list.isEmpty() -> acc
    list.size == 0 -> acc
    else -> {
        val head = list.head()
        val maxValue = if(head > acc) head else acc
        println("head: $head, acc: $acc, maxValue: $maxValue")
        tailrecMaximum(list.tail(), maxValue)
    }
}
