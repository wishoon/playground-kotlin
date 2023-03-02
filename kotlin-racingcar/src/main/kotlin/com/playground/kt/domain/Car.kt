package com.playground.kt.domain

const val MOVE_STANDARD = 4

class Car(
    val name: Name,
    val position: Position = Position(0)
) {

    fun moveForward(value: Int) {
        if (value >= MOVE_STANDARD) {
            position.forward()
        }
    }

    fun isSamePosition(position: Int): Boolean {
        return this.position.isSame(position)
    }
}
