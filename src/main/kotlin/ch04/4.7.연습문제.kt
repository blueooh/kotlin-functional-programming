package ch04

import util.head
import util.tail

fun main() {
    println(takeWhile({it > 3}, listOf(1,2,3,4,5)))
}

tailrec fun <P> takeWhile(func: (P) -> Boolean, list: List<P>, acc: List<P> = listOf()): List<P> = when {
    list.isEmpty() -> acc
    else -> {
        val result = if(func(list.head())) {
            acc + list.head()
        } else {
            acc
        }

        takeWhile(func, list.tail(), result)
    }
}