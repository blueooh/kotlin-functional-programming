package ch04

// 4.5.연습문제 compose사용해서 구현

fun main() {
    val max = {i: List<Int> -> i.max()}
    val power = {i: Int -> i * i}
    val composed = power compose max
    println(composed(listOf(1, 2, 3)))
}

infix fun <F, G, R> ((F) -> R).compose(g: (G) -> F): (G) -> R {
    return { gInput: G -> this(g(gInput))}
}
