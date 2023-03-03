package com.example.moviesandroidacademy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val fragment = FragmentMoviesList()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentsPlace, fragment)
            addToBackStack(null)
            commit()

        }
    }
}