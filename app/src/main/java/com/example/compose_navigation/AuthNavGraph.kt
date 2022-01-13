package com.example.compose_navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation

fun NavGraphBuilder.AuthNavGraph(navController: NavHostController){
    navigation(
        startDestination = Screen.Login.route,
        route = Authencation_Route
    ){
        composable(route = Screen.Login.route){ LoginScreen(navController = navController)}
        composable(route = Screen.SignUp.route){ signUpScreen(navController = navController) }
    }

}