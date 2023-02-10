package com.example.moviesandroidacademy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class FragmentMoviesList : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movies_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val card = view.findViewById<CardView>(R.id.avengers)
        card.setOnClickListener {
            val newFragmentMoviesDetails = FragmentMoviesDetails()
            parentFragmentManager.beginTransaction().apply {
                addToBackStack("MovieFragment")
                replace(R.id.fragmentsPlace, newFragmentMoviesDetails)
                commit()
            }
        }
    }
}