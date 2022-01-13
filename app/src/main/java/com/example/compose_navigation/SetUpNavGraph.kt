package com.example.compose_navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.compose_navigation.ui.theme.DetailScreen
import com.example.compose_navigation.ui.theme.HomeScreen

@Composable
fun setUpNavGraph(navController:NavHostController){
    NavHost(navController =navController,
        startDestination = Home_route,
        route = Route_route
    ){

       HomeNavGraph(navController)
        AuthNavGraph(navController)
    }


}