package com.tugas.frontendapp.model

data class Manga(
    val id: Int,
    val name: String,
    val photo: Int,
    val score: Float,
    val ranked: Int,
    val published: String,
    val synopsis: String,
)
