package ch04

// 부분적용함수로 max함수 구현

fun main() {
    val max = max(10)
    println(max(2))
}

fun max(a: Int) = {b: Int -> when {
    a > b -> a
    else ->b
} }