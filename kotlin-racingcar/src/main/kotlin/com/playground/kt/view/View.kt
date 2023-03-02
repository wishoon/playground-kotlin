package com.playground.kt.view

import com.playground.kt.domain.Car
import kotlin.NumberFormatException

fun inputNames(): List<String> {
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val input = readln()
    return input.split(",")
}

fun inputRounds(): Int {
    println("시도할 횟수는 몇회인가요?")
    return inputToInt()
}

private fun inputToInt(): Int {
    try {
        return readln().toInt()
    } catch (e: NumberFormatException) {
        throw NumberFormatException("[ERROR] 숫자를 입력하세요.")
    }
}

fun outputRoundResult(cars: List<Car>) {
    cars.forEach {
        println("${it.name.value.trim()} : ${dash(it.position.value)}")
    }
    println()
}

private fun dash(value: Int) = "-".repeat(value)

fun outputFinalResult(winners: List<String>) {
    println("${winners.joinToString(",").trim()}가 최종 우승했습니다.")
}

