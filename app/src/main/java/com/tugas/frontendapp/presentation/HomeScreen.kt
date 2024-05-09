package com.tugas.frontendapp.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Timeline
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.tugas.frontendapp.data.DummyData
import com.tugas.frontendapp.model.Anime
import com.tugas.frontendapp.model.Manga
import com.tugas.frontendapp.navigation.Screen
import com.tugas.frontendapp.presentation.component.AnimeItem
import com.tugas.frontendapp.presentation.component.MangaItem
import com.tugas.frontendapp.presentation.component.shareItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    animes: List<Anime> = DummyData.Animes,
    mangas: List<Manga> = DummyData.Mangas,
) {

    var searchQuery by remember { mutableStateOf("") }

    fun filterList(animes: List<Anime>, mangas: List<Manga>): Pair<List<Anime>, List<Manga>> {
        val filteredAnimes = if (searchQuery.isEmpty()) animes else {
            animes.filter { it.name.contains(searchQuery, ignoreCase = true) }
        }
        val filteredMangas = if (searchQuery.isEmpty()) mangas else {
            mangas.filter { it.name.contains(searchQuery, ignoreCase = true) }
        }
        return Pair(filteredAnimes, filteredMangas)
    }

    Column(modifier = modifier) {
        TopAppBar(
            title = { Text(text = "Home") },
            actions = {
                IconButton(
                    onClick = { shareItem(navController.context) }
                ) {
                    Icon(Icons.Default.Share, contentDescription = "Share")
                }
            }
        )
        TextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            placeholder = { Text("Search") },
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .fillMaxWidth()
        )

        val (filteredAnimes, filteredMangas) = filterList(animes, mangas)

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = modifier
        ) {

            item {
                if (animes.isNotEmpty() && searchQuery.isEmpty()) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                    ) {
                        Text(
                            "Top Anime Series",
                            fontSize = 20.sp,
                            color = Color.Red,
                            fontWeight = FontWeight.Bold
                        )
                        Icon(
                            imageVector = Icons.Default.LocalFireDepartment,
                            contentDescription = null,
                            tint = Color.Red,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }
            item {
                if (filteredAnimes.isNotEmpty()) {
                    LazyRow(
                        contentPadding = PaddingValues(16.dp),
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        modifier = modifier
                    ) {
                        items(filteredAnimes, key = { it.id }) {
                            AnimeItem(anime = it) { animeId ->
                                navController.navigate(Screen.DetailAnime.route + "/$animeId")
                            }
                        }
                    }
                }
            }
            item {
                if (mangas.isNotEmpty() && searchQuery.isEmpty()) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                    ) {
                        Text(
                            "Top Manga",
                            fontSize = 20.sp,
                            color = Color.Red,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(
                            imageVector = Icons.Default.Timeline,
                            contentDescription = null,
                            tint = Color.Red,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }
            items(filteredMangas, key = { it.id }) {
                MangaItem(manga = it) { mangaId ->
                    navController.navigate(Screen.DetailManga.route + "/$mangaId")
                }
            }
        }
    }
}

