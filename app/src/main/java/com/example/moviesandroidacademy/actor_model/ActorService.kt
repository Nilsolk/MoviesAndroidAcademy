package com.example.moviesandroidacademy.actor_model

import com.example.moviesandroidacademy.R

interface ActorService {
    fun addItemsToList() : MutableList<Actor>
    class Base : ActorService {
        private val actorList = mutableListOf<Actor>()
        override fun addItemsToList(): MutableList<Actor> {
            actorList.add(Actor(R.drawable._f8f5ec204f1a37e0e15e2a731ab190a,R.string.robert_downey_jr))
            actorList.add(Actor(R.drawable._c9007d7ca26a2d00d93fe8d18c89643,R.string.chris_hemsworth))
            actorList.add(Actor(R.drawable.eeb8d6e5b9c059a681dcbe67501dceae, R.string.mark_ruffalo))
            actorList.add(Actor(R.drawable.f56e2ec650a0ee6e64c9b1356e383bb3,R.string.chris_hemsworth))
            return actorList
        }

    }
}