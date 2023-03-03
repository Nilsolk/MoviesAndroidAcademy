package com.example.moviesandroidacademy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesandroidacademy.movie_model.Movie

class MoviesListAdapter(private val clickListener: OnClickListener) :
    RecyclerView.Adapter<MoviesViewHolder>() {
    private val movies = mutableListOf<Movie>()
    fun setData(newData: List<Movie>) {
        movies.clear()
        movies.addAll(newData)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return MoviesViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.view_holder_movie, parent, false)
        )
    }

    override fun getItemCount() = movies.size

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bindData(movies[position])
        holder.itemView.setOnClickListener {
            clickListener.onClick(movies[position])
        }
    }
}

class MoviesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindData(movie: Movie) {
        val params = movie.returnValues()
        itemView.findViewById<ImageView>(R.id.banner).setImageResource(movie.getImage())
        itemView.findViewById<TextView>(R.id.banner_name).text = params[0]
        itemView.findViewById<TextView>(R.id.genres).text = params[1]
        itemView.findViewById<TextView>(R.id.banner_time).text = params[3]
        itemView.findViewById<TextView>(R.id.banner_reviews).text = params[2]
    }
}

interface OnClickListener {
    fun onClick(movie: Movie)
}
