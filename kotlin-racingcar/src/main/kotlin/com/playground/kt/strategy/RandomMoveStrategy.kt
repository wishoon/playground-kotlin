package com.playground.kt.strategy

const val MIN_VALUE = 0
const val MAX_VALUE = 9

class RandomMoveStrategy(
    private val range: IntRange = (MIN_VALUE..MAX_VALUE)
) : MoveStrategy {

    override fun generateValue(): Int {
        return range.random()
    }
}
