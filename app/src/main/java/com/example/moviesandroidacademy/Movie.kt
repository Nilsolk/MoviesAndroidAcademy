package com.example.moviesandroidacademy

data class Movie(
    private val imageMovie: Int,
    private val genre: String,
    private val reviews: String,
    private val name: String,
    private val time: String
) {

    fun returnValues(): List<String> {
        return listOf(name, genre, reviews, time)
    }

    fun getImage(): Int {
        return imageMovie
    }
}
