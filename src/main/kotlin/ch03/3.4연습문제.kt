import java.util.*

fun main() {
    println(toBinary(52))
}

fun toBinary(n: Int): String = when {
    n > 1 ->  toBinary(n/2) + (n%2).toString()
    else -> n.toString()
}