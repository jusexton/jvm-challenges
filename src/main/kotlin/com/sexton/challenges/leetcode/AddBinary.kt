package com.sexton.challenges.leetcode

object AddBinary {
    fun addBinary(a: String, b: String): String = a.toBigInteger(2).plus(b.toBigInteger(2)).toString(2)
}