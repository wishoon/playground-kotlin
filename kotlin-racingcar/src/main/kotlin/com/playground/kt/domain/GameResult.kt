package com.playground.kt.domain

class GameResult(
    private val cars: Cars
) {

    fun findWinners(): List<String> {
        return cars.cars
            .filter { it.isSamePosition(cars.maxPosition()) }
            .map { it.name.value }
    }
}
