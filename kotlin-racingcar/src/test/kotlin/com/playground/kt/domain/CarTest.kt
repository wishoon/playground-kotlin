package com.playground.kt.domain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CarTest {

    @Test
    fun `이름을 통해 자동차를 생성할 수 있다`() {
        assertDoesNotThrow { Car(Name("str")) }
    }

    @Test
    fun `위치 값이 4 이상일 경우 자동차는 전진할 수 있다`() {
        val car = Car(Name("str"))

        car.moveForward(4)

        assertEquals(car.position.value, 1)
    }

    @Test
    fun `위치 값이 3 이하일 경우 자동차는 전진할 수 없다`() {
        val car = Car(Name("str"))

        car.moveForward(3)

        assertEquals(car.position.value, 0)
    }

    @Test
    fun `위치 값이 같은 자동차의 경우 true 값을 반환한다`() {
        val expected = Car(Name("str"))

        assertTrue(expected.isSamePosition(0))
    }

    @Test
    fun `위치 값이 다른 자동차의 경우 false 값을 반환한다`() {
        val expected = Car(Name("str"), Position(1))

        assertFalse(expected.isSamePosition(0))
    }
}
