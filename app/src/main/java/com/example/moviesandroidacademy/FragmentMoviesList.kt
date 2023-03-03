package com.example.moviesandroidacademy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesandroidacademy.movie_model.Movie
import com.example.moviesandroidacademy.movie_model.MovieService

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

        val recyclerView = view.findViewById<RecyclerView>(R.id.movieRecyclerView)
        val adapter = MoviesListAdapter(object : OnClickListener {
            override fun onClick(movie: Movie) {
                if (movie.returnValues()[0] == "Avengers : End Game") {
                    parentFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentsPlace, FragmentMoviesDetails())
                        commit()
                    }
                }
            }
        })
        val moviesService = MovieService.Base(this).generateMoviesList()

        adapter.setData(moviesService)
        recyclerView.adapter = adapter
    }

    override fun onStart() {
        super.onStart()

    }

}