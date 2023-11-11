package com.cuinsolutions.memorycalculator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform