package com.example.kotlin.training.section_04_extensions_function

fun Int?.isEven(): Boolean {
    return this?.rem(2) == 0
}

fun List<Int>.evenNumbers(): List<Int> {
    return filter(Int::isEven)
}