package com.sexton.challenges.codewars

import com.sexton.challenges.codewars.isBackwardsPrime

fun backwardsPrimes(start: Long, end: Long): String =
        (start..end).filter { it.isBackwardsPrime() }.joinToString(" ")
