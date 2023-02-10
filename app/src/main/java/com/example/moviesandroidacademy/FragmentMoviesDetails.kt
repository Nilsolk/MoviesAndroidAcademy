package com.example.moviesandroidacademy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentMoviesDetails : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_movies_details, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonBack = view.findViewById<TextView>(R.id.backButton)
        buttonBack.setOnClickListener {
            val fragment = FragmentMoviesList()
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentsPlace, fragment)
                commit()
            }
        }
    }
}