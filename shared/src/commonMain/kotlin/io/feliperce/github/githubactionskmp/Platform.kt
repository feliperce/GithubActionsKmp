package io.feliperce.github.githubactionskmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform