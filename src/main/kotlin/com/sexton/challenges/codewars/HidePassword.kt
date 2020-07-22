package com.sexton.challenges.codewars

fun hidePassword(string: String): String =
        Regex("(?<=&password=).*|(?<=password=).*(?=&)").replace(string) { "*".repeat(it.value.length) }
