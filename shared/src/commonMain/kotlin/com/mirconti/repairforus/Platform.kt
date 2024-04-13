package com.mirconti.repairforus

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform