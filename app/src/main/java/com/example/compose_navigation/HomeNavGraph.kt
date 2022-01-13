package com.example.compose_navigation

import android.accessibilityservice.AccessibilityService
import android.util.Log
import androidx.navigation.*
import androidx.navigation.compose.composable
import com.example.compose_navigation.ui.theme.DetailScreen
import com.example.compose_navigation.ui.theme.HomeScreen

fun NavGraphBuilder.HomeNavGraph(navController:NavHostController){
     navigation(
         startDestination = Screen.Home.route,
         route = Home_route
     ){
         composable(route = Screen.Home.route,){ HomeScreen(navController) }


         composable(route = Screen.Detail.route,
             arguments = listOf(
                 navArgument(DETAIL_ARGUMENT_KEY){
                     type= NavType.IntType
                     defaultValue=0
                 },
                 navArgument(DETAIL_ARGUMENT_KEY2){
                     type= NavType.StringType
                 }
             )
         ){
             Log.d("args","${it.arguments?.getInt(DETAIL_ARGUMENT_KEY)}")
             Log.d("args","${it.arguments?.getString(DETAIL_ARGUMENT_KEY2)}")
             DetailScreen(navController)
         }
     }

}