package com.playground.kt.domain

import com.playground.kt.strategy.MoveStrategy

class Cars(
    val cars: List<Car>
) {

    companion object {
        fun from(names: List<String>): Cars = Cars(names.map { Car(Name(it), Position(0)) })
    }

    fun moveAll(strategy: MoveStrategy) {
        cars.forEach { it.moveForward(strategy.generateValue()) }
    }

    fun maxPosition(): Int = cars.maxOf { it.position.value }
}
