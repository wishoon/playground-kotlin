package com.playground.kt.domain

const val plusValue = 1

class Position(
    var value: Int = 0
) {

    fun forward() {
        this.value += plusValue
    }

    fun isSame(position: Int): Boolean {
        return this.value == position
    }
}
