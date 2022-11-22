package util

fun <T> List<T>.head()= first()

fun <T> List<T>.tail() = drop(1)