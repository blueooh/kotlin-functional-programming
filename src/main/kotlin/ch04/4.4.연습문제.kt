package ch04

// curried활용하여 매개변수 2개 받는 min함수 구현

fun main() {
    val minFunc = {i1: Int, i2: Int -> when {
        i1 > i2 -> i2
        else -> i1
    }}

    val curried = minFunc.curried()
    println(curried(10)(2))

}

fun <P1, P2, R> ((P1, P2) -> R).curried(): (P1) -> (P2) -> R = {p1: P1 -> { p2: P2 -> this(p1, p2) }}