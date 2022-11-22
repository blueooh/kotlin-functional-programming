fun main() {
    val list = Array<Int>(100){ 0 }
    factorialMemoization(list, 10)
    println(list[10])
}

fun factorialMemoization(list: Array<Int>, n: Int): Unit {
    list[0] = 1
    list[1] = 1
    (1 .. n).forEach {
        list[it] = it * list[it - 1]
    }
}