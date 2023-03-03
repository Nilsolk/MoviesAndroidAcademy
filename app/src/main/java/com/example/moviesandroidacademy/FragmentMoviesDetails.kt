package com.example.moviesandroidacademy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesandroidacademy.actor_model.ActorService

class FragmentMoviesDetails : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_movies_details, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.actors_recyclerView)
        val adapter = MoviesDetailsActorsAdapter()
        val actorService = ActorService.Base().addItemsToList()

        adapter.setData(actorService)
        recyclerView.adapter = adapter

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