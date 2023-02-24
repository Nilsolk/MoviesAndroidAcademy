package com.example.moviesandroidacademy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
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
        val card = view.findViewById<ConstraintLayout>(R.id.movies_list)
        card.setOnClickListener {
            val newFragmentMoviesDetails = FragmentMoviesDetails()
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentsPlace, newFragmentMoviesDetails)
                commit()
            }
        }
    }

}