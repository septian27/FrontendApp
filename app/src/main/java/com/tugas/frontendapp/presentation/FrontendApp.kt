package com.tugas.frontendapp.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Diamond
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.tugas.frontendapp.R
import com.tugas.frontendapp.navigation.NavigationItem
import com.tugas.frontendapp.navigation.Screen

@Composable
fun FrontendApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val context = LocalContext.current

    Scaffold(
        bottomBar = {
            val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
            BottomBar(navController, currentRoute == Screen.Home.route || currentRoute == Screen.Movie.route || currentRoute == Screen.About.route)
        },
        modifier = modifier
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navController)
            }

            composable(Screen.Movie.route) {
                MovieScreen(navController)
            }

            composable(Screen.About.route) {
                AboutScreen(navController)
            }

            composable(
                Screen.DetailAnime.route + "/{animeId}",
                arguments = listOf(navArgument("animeId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailAnimeScreen(
                    navController = navController,
                    animesId = navBackStackEntry.arguments?.getInt("animeId")
                )
            }
            composable(
                Screen.DetailManga.route + "/{mangaId}",
                arguments = listOf(navArgument("mangaId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailMangaScreen(
                    navController = navController,
                    mangasId = navBackStackEntry.arguments?.getInt("mangaId")
                )
            }
            composable(
                Screen.DetailMovie.route + "/{movieId}",
                arguments = listOf(navArgument("movieId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailMovieScreen(
                    navController = navController,
                    moviesId = navBackStackEntry.arguments?.getInt("movieId")
                )
            }
        }
    }
}


@Composable
private fun BottomBar(
    navController: NavHostController,
    shouldShow: Boolean,
    modifier: Modifier = Modifier
) {
    if (shouldShow) {
        NavigationBar(
            modifier = modifier
        ) {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route

            val navigationItems = listOf(
                NavigationItem(
                    title = stringResource(id = R.string.menu_home),
                    icon = Icons.Default.Home,
                    screen = Screen.Home
                ),
                NavigationItem(
                    title = stringResource(id = R.string.menu_movie),
                    icon = Icons.Default.Diamond,
                    screen = Screen.Movie
                ),
                NavigationItem(
                    title = stringResource(id = R.string.menu_about),
                    icon = Icons.Default.AccountCircle,
                    screen = Screen.About
                )
            )
            navigationItems.map { item ->
                NavigationBarItem(
                    selected = currentRoute == item.screen.route,
                    onClick = {
                        navController.navigate(item.screen.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            restoreState = true
                            launchSingleTop = true
                        }
                    },
                    icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                    label = { Text(text = item.title) }
                )
            }
        }
    }
}
