package com.playground.kt.domain

class Round(
    var value: Int
) {
    init {
        require(value > 0) { "[ERROR] 시도 횟수는 1 이상이여야 합니다." }
    }
}
