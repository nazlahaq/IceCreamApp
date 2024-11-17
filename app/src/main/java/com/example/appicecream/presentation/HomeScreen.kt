package com.example.appicecream.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.appicecream.data.DummyData
import com.example.appicecream.model.Popular
import com.example.appicecream.model.Recommend
import com.example.appicecream.navigation.Screen
import com.example.appicecream.presentation.component.PopularItem
import com.example.appicecream.presentation.component.RecommendItem


@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    populars: List<Popular> = DummyData.popularsItems,
    recommends: List<Recommend> = DummyData.recommendsItems,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            ) {
                items(populars, key = { it.id }) {
                    PopularItem (popular = it) { popularId ->
                        navController.navigate(Screen.DetailPopular.route + "/$popularId")
                        println("Navigating to: ${Screen.DetailPopular.route + "/$popularId"}")

                    }
                }
            }
        }
        items(recommends, key = { it.id }) {
            RecommendItem(recommend = it, modifier = Modifier.padding(horizontal = 16.dp)) { recommendId ->
                navController.navigate(Screen.DetailRecommend.route + "/$recommendId")
                println("Navigating to: ${Screen.DetailRecommend.route + "/$recommendId"}")

            }
        }
    }
}