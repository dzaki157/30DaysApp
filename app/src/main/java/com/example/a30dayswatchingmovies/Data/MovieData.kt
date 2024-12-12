package com.example.a30dayswatchingmovies.Data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class MovieData(
    @StringRes val dateRes: Int,          // Tanggal rilis film
    @StringRes val titleRes: Int,         // Judul film
    @StringRes val descriptionRes: Int,   // Deskripsi film
    @DrawableRes val imageRes: Int        // Poster film
)