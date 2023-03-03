package com.example.moviesandroidacademy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesandroidacademy.actor_model.Actor

class MoviesDetailsActorsAdapter : RecyclerView.Adapter<MoviesDetailViewHolder>() {
    private val actorList = mutableListOf<Actor>()

    fun setData(newList: List<Actor>) {
        actorList.clear()
        actorList.addAll(newList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesDetailViewHolder {
        return MoviesDetailViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.view_holder_actor, parent, false)
        )
    }

    override fun getItemCount() = actorList.size

    override fun onBindViewHolder(holder: MoviesDetailViewHolder, position: Int) {
        holder.onBindActors(actorList[position])
    }

}

class MoviesDetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun onBindActors(actor: Actor) {
        val params = actor.returnData()
        val text = params[1]
        val image = params[0]

        itemView.findViewById<ImageView>(R.id.actor_image).setImageResource(image)
        itemView.findViewById<TextView>(R.id.actor_text).setText(text)
    }
}