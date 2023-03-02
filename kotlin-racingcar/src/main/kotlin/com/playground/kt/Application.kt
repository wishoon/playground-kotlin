package com.playground.kt

import com.playground.kt.domain.Cars
import com.playground.kt.domain.GameResult
import com.playground.kt.domain.Round
import com.playground.kt.strategy.RandomMoveStrategy
import com.playground.kt.view.inputNames
import com.playground.kt.view.inputRounds
import com.playground.kt.view.outputFinalResult
import com.playground.kt.view.outputRoundResult

fun main() {

    val cars = Cars.from(inputNames())
    val rounds = Round(inputRounds())

    for (round in 1..rounds.value) {
        cars.moveAll(RandomMoveStrategy())
        outputRoundResult(cars.cars)
    }

    outputFinalResult(GameResult(cars).findWinners())
}
