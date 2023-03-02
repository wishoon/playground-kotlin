package com.playground.kt.domain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException

internal class RoundTest {

    @Test
    fun `자연수의 값을 가질 경우 시도 횟수를 생성할 수 있다`() {
        assertDoesNotThrow { Round(1) }
    }


    @Test
    fun `자연수의 값이 아닐 경우 시도 횟수를 생성하면 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> { Round(0) }
    }
}
