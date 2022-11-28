package ch04

import java.lang.IllegalArgumentException


// 부분함수 invokeOrElse함수 구현

fun main() {
    val condition: (Int) -> Boolean = {it % 2 == 0}
    val body: (Int) -> String = { "$it is even"}

    val isEven = body.toPartialFunction(condition)

    if(isEven.isDefinedAt(4)) {
        println(isEven.invokeOrElse(4, "default value"))
    } else {
        print("isDefinedAt(x) return false")
    }
}

fun <P, R> ((P) -> R).toPartialFunction(definedAt: (P) -> Boolean): PartialFunction<P, R> = PartialFunction(definedAt, this)

class PartialFunction<in P, R>(
    private val condition: (P) -> Boolean,
    private val f: (P) -> R
) : (P) -> (R) {
    override fun invoke(p: P): R = when {
        condition(p) -> f(p)
        else -> throw IllegalArgumentException("$p isn't supported.")
    }
    fun isDefinedAt(p: P): Boolean = condition(p)

    fun invokeOrElse(p: P, default: R): R =
        try {
            invoke(p)
        } catch (e: IllegalArgumentException) {
            default
        }
}
