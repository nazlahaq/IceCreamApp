package com.example.appicecream.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Gallery: Screen("gallery")
    data object About: Screen("about")
    data object DetailPopular: Screen("detail_populars")
    data object DetailRecommend: Screen("detail_recommends")
}