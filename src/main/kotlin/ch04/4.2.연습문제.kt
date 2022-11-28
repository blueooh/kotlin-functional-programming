package ch04

// 파라미터 3개를 받는 부분 함수 구현

fun main() {
    val partialFunction1 = {p1: String, p2: String, p3: String -> p1 + p2 + p3}.partial1("hello", "world")
    println(partialFunction1("andy"))

}

fun <P1, P2, P3, R> ((P1, P2, P3) -> (R)).partial1(p1: P1, p2: P2): (P3) -> R = {p3 -> this(p1, p2, p3)}
