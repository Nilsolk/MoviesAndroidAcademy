package com.example.moviesandroidacademy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        if (savedInstanceState == null) {
            val fragment = FragmentMoviesList()
            supportFragmentManager.beginTransaction().add(R.id.fragmentsPlace, fragment).commit()
        }
    }
}