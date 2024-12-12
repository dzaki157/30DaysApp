package com.example.a30dayswatchingmovies.ui.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.a30dayswatchingmovies.components.MovieCard
import com.example.a30dayswatchingmovies.model.Movie

@Composable
fun MovieLogScreen(contentPadding: PaddingValues) {
    LazyColumn(contentPadding = contentPadding) {
        items(Movie.movies) { movie ->
            MovieCard(movie = movie)
        }
    }
}