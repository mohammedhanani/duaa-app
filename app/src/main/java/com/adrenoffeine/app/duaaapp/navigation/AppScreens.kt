package com.adrenoffeine.app.duaaapp.navigation


enum class AppScreens {
    HomeScreen,
    DuaaScreen,
    profileScreen;
    companion object {
        fun fromRoute(route:String?):AppScreens
        = when (route?.substringBefore("/")){
            HomeScreen.name -> HomeScreen
            DuaaScreen.name -> DuaaScreen
            profileScreen.name -> profileScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not valid")
        }
    }
}