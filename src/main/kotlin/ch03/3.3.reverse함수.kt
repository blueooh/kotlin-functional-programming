import util.head
import util.tail

fun main() {
    println(reverse("andy"))
}

fun reverse(str: String): String = when {
    str.isEmpty() -> ""
    else -> reverse(str.tail()) + str.head()
}