package com.nusuki.app.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Book
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.nusuki.app.R

@Composable
fun MainScreen() {
    var selectedTab by remember { mutableStateOf(0) }
    val items = listOf(
        stringResource(R.string.home),
        stringResource(R.string.quran),
        stringResource(R.string.worship),
        stringResource(R.string.qibla),
        stringResource(R.string.more)
    )

    Scaffold(
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = null) },
                    label = { Text(items[0]) },
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Book, contentDescription = null) },
                    label = { Text(items[1]) },
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Star, contentDescription = null) },
                    label = { Text(items[2]) },
                    selected = selectedTab == 2,
                    onClick = { selectedTab = 2 }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Place, contentDescription = null) },
                    label = { Text(items[3]) },
                    selected = selectedTab == 3,
                    onClick = { selectedTab = 3 }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Menu, contentDescription = null) },
                    label = { Text(items[4]) },
                    selected = selectedTab == 4,
                    onClick = { selectedTab = 4 }
                )
            }
        }
    ) { innerPadding ->
        Surface(modifier = Modifier.padding(innerPadding)) {
            when (selectedTab) {
                0 -> HomeScreen()
                1 -> QuranScreen()
                2 -> WorshipScreen()
                3 -> QiblaScreen()
                4 -> MoreScreen()
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Surface(modifier = androidx.compose.ui.Modifier.fillMaxSize()) {
        Text(text = "مرحباً بك في نسكي — رفيقك في عبادتك", modifier = androidx.compose.ui.Modifier.padding(16.dp))
    }
}

@Composable
fun QuranScreen() {
    Surface(modifier = androidx.compose.ui.Modifier.fillMaxSize()) {
        Text(text = "القرآن الكريم", modifier = androidx.compose.ui.Modifier.padding(16.dp))
    }
}

@Composable
fun WorshipScreen() {
    Surface(modifier = androidx.compose.ui.Modifier.fillMaxSize()) {
        Text(text = "العبادات والأذكار", modifier = androidx.compose.ui.Modifier.padding(16.dp))
    }
}

@Composable
fun QiblaScreen() {
    Surface(modifier = androidx.compose.ui.Modifier.fillMaxSize()) {
        Text(text = "اتجاه القبلة", modifier = androidx.compose.ui.Modifier.padding(16.dp))
    }
}

@Composable
fun MoreScreen() {
    Surface(modifier = androidx.compose.ui.Modifier.fillMaxSize()) {
        Text(text = "المزيد من الخدمات", modifier = androidx.compose.ui.Modifier.padding(16.dp))
    }
}