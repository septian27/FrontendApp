package com.tugas.frontendapp.model

data class Movie(
    val id: Int,
    val name: String,
    val photo: Int,
    val score: Float,
    val ranked: Int,
    val synopsis: String,
    val studio: String
)