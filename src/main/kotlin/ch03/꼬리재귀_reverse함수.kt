package ch03

import util.head
import util.tail

fun main() {
    println(tailrecReverse("andy"))
}

tailrec fun tailrecReverse(str: String, acc: String = ""): String = when {
    str.isEmpty() -> acc
    else -> {
        val head = str.head()
        val reversed = head + acc
        println("head: $head, acc: $acc")
        tailrecReverse(str.tail(), reversed)
    }
}
