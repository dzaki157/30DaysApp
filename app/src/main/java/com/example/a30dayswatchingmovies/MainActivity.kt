package com.example.a30dayswatchingmovies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a30dayswatchingmovies.ui.theme.MovieLogScreen
import com.example.a30dayswatchingmovies.ui.theme.A30dayswatchingmoviesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            A30dayswatchingmoviesTheme(
                darkTheme = false
            ) {
                Surface(color = MaterialTheme.colorScheme.background) {
                    _30DaysWatchingMovies()
                }
            }
        }
    }
}

@Composable
fun _30DaysWatchingMovies() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar()
        }
    ) { paddingValues ->
        MovieLogScreen(contentPadding = paddingValues)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "30 Days Watching Movies",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onPrimary
            )
        },
        modifier = modifier,
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    )
}

@Preview(showBackground = true)
@Composable
fun MovieLogScreenPreview() {
    A30dayswatchingmoviesTheme {
        _30DaysWatchingMovies()
    }
}
