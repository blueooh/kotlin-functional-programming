import java.util.*

fun main() {
    println(tailrecToBinary(52))
}

tailrec fun tailrecToBinary(n: Int, acc: String = ""): String = when {
    n <= 1 -> (n%2).toString() + acc
    else ->  {
        val binary = (n%2).toString() + acc
        tailrecToBinary(n/2, binary)
    }
}