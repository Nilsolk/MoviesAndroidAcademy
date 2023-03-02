package com.example.moviesandroidacademy

import androidx.annotation.ArrayRes
import androidx.annotation.DrawableRes

interface MovieService {

    fun movie(@ArrayRes id: Int, @DrawableRes imageId: Int): Movie
    fun generateMoviesList(): List<Movie>

    class Base(private val context: FragmentMoviesList) : MovieService {
        private var movieList: MutableList<Movie> = mutableListOf()

        override fun movie(
            @ArrayRes id: Int,
            @DrawableRes imageId: Int
        ): Movie {
            val listOfParams: Array<String> = context.resources.getStringArray(id)
            return Movie(
                name = listOfParams[0],
                genre = listOfParams[1],
                reviews = listOfParams[2],
                time = listOfParams[3],
                imageMovie = imageId
            )
        }

        override fun generateMoviesList(): List<Movie> {
            movieList.add(movie(R.array.Avengers, R.drawable._a57639f_1f12_4eef_a1a7_c8b881a967c6))
            movieList.add(movie(R.array.BlackWidow, R.drawable.black_window))
            movieList.add(movie(R.array.Tenet, R.drawable.tenet))
            movieList.add(movie(R.array.WonderWoman, R.drawable.wonder_woman))
            return movieList
        }
    }

}
