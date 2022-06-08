package com.adrenoffeine.app.duaaapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.adrenoffeine.app.duaaapp.screens.DuaaScreen
import com.adrenoffeine.app.duaaapp.screens.HomeScreen
import com.adrenoffeine.app.duaaapp.screens.myprofile.profileScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.HomeScreen.name){
        composable(AppScreens.HomeScreen.name){
            //here we pass the composable that we want to show or implement to !!
            HomeScreen(navController = navController)
        }
        composable(AppScreens.DuaaScreen.name+"/{duaa}",
        arguments = listOf(navArgument(name = "duaa") {type = NavType.StringType})){
            backStackEntry ->

            DuaaScreen(navController = navController,backStackEntry.arguments?.getString("duaa"))
        }
        composable(AppScreens.profileScreen.name){
            profileScreen(navController = navController)
        }
    }

}