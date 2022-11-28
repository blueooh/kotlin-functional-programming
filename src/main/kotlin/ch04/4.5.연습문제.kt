package ch04

// max, power 함수 합성

fun main() {
    val max = {i: List<Int> -> i.max()}
    val power = {i: Int -> i * i}
    println(power(max(listOf(1, 2, 3))))
}