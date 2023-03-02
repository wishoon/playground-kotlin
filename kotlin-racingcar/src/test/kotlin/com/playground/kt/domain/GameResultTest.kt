package com.playground.kt.domain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GameResultTest {

    @Test
    fun `우승한 자동차들을 반환할 수 있다`() {
        val cars = Cars(listOf(Car(Name("win"), Position(1)), Car(Name("lose"))))
        val gameResult = GameResult(cars)

        val expected = gameResult.findWinners()

        assertEquals(expected, listOf("win"))
    }
}
