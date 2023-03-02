package com.playground.kt.domain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PositionTest {

    @Test
    fun `위치 값을 증가시킬 수 있다`() {
        val position = Position()

        position.forward()

        assertEquals(position.value, 1)
    }

    @Test
    fun `위치 값이 같을 경우 true 값을 반환한다`() {
        val expected = Position()

        assertTrue(expected.isSame(0))
    }

    @Test
    fun `위치 값이 다른 경우 false 값을 반환한다` () {
        val expected = Position()

        assertFalse(expected.isSame(1))
    }
}
