package ch05

fun main() {
    val list = FunList.Cons(1, FunList.Cons(2, FunList.Nil))
    println(list.getHead())
}

fun <T> FunList<T>.getHead(): T = when(this) {
    FunList.Nil -> throw NoSuchElementException()
    is FunList.Cons -> head
}
