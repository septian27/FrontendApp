package com.tugas.frontendapp.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object DetailAnime: Screen("detail_anime")
    data object DetailManga: Screen("detail_manga")
    data object DetailMovie: Screen("detail_movie")
    data object Movie: Screen("movie")
    data object About: Screen("about")
}
