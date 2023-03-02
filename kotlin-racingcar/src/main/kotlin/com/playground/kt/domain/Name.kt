package com.playground.kt.domain

const val MINIMUM_LENGTH = 1
const val MAXIMIN_LENGTH = 5

class Name(
    val value: String
) {

    init {
        require(value.isNotEmpty()) { "[ERROR] 이름은 빈 값일 수 없습니다." }
        require(value.length in MINIMUM_LENGTH..MAXIMIN_LENGTH) { "[ERROR] 이름의 길이는 1 ~ 5 사이여야 합니다." }
    }
}
