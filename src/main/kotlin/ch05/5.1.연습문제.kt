package ch05

import java.util.NoSuchElementException

fun main() {
    val list = FunList.Cons(1, FunList.Cons(2, FunList.Cons(3, FunList.Cons(4, FunList.Cons(5, FunList.Nil)))))
    println(list)
    val newList = list.addHead(0)
    println(newList)
}

sealed class FunList<out T> {
    object Nil: FunList<Nothing>()
    data class Cons<out T>(val head: T, val tail: FunList<T>): FunList<T>()
}

fun <T> FunList<T>.addHead(value: T) = FunList.Cons(value, this)