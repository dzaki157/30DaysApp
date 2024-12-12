package com.example.a30dayswatchingmovies.model

import com.example.a30dayswatchingmovies.R
import com.example.a30dayswatchingmovies.Data.MovieData

object Movie {
    val movies = listOf(
        MovieData(
            dateRes = R.string.date1,
            titleRes = R.string.movie1,
            descriptionRes = R.string.movie_description1,
            imageRes = R.drawable.bayi_ajaib
        ),
        MovieData(
            dateRes = R.string.date2,
            titleRes = R.string.movie2,
            descriptionRes = R.string.movie_description2,
            imageRes = R.drawable.desa_penari
        ),
        MovieData(
            dateRes = R.string.date3,
            titleRes = R.string.movie3,
            descriptionRes = R.string.movie_description3,
            imageRes = R.drawable.kuyang
        ),
        MovieData(
            dateRes = R.string.date4,
            titleRes = R.string.movie4,
            descriptionRes = R.string.movie_description4,
            imageRes = R.drawable.pamali
        ),
        MovieData(
            dateRes = R.string.date5,
            titleRes = R.string.movie5,
            descriptionRes = R.string.movie_description5,
            imageRes = R.drawable.qorin
        ),
        MovieData(
            dateRes = R.string.date6,
            titleRes = R.string.movie6,
            descriptionRes = R.string.movie_description6,
            imageRes = R.drawable.sewu_dino
        ),
        MovieData(
            dateRes = R.string.date7,
            titleRes = R.string.movie7,
            descriptionRes = R.string.movie_description7,
            imageRes = R.drawable.siksa_neraka
        ),
        MovieData(
            dateRes = R.string.date8,
            titleRes = R.string.movie8,
            descriptionRes = R.string.movie_description8,
            imageRes = R.drawable.waktu_magrib
        )
    )
}
