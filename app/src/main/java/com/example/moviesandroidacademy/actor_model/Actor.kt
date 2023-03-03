package com.example.moviesandroidacademy.actor_model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Actor(@DrawableRes private val image: Int, @StringRes private val name: Int) {
    fun returnData() = listOf<Int>(image, name)
}
