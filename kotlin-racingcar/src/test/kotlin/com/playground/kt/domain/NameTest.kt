package com.playground.kt.domain

import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import java.lang.IllegalArgumentException

internal class NameTest {

    @ParameterizedTest
    @ValueSource(strings = ["a", "abcde"])
    fun `1에서 5이하의 길이를 가지는 자동차 이름을 생성할 수 있다`(str: String) {
        assertDoesNotThrow { Name(str) }
    }

    @ParameterizedTest
    @ValueSource(strings = ["", "abcdef"])
    fun `1에서 5이하의 길이를 가지지 않는 자동차 이름을 생성할 경우 예외가 발생한다`(str: String) {
        assertThrows<IllegalArgumentException> { Name(str) }
    }
}
