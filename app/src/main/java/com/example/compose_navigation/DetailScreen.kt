package com.example.compose_navigation.ui.theme

import android.os.Bundle
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.compose_navigation.DETAIL_ARGUMENT_KEY
import com.example.compose_navigation.DETAIL_ARGUMENT_KEY2
import com.example.compose_navigation.Screen

@Composable
fun DetailScreen(navcontroller:NavHostController){


    var s=  navcontroller.currentBackStackEntry?.arguments?.getInt(DETAIL_ARGUMENT_KEY)
    var s1=  navcontroller.currentBackStackEntry?.arguments?.getString(DETAIL_ARGUMENT_KEY2)

    Log.d("passed_data","$s and $s1")
    Box(modifier = Modifier
        .fillMaxSize(),contentAlignment = Alignment.Center) {
        Text(text = "DetailScreen",modifier =Modifier
            .clickable {
                       navcontroller.navigate(Screen.Home.route){
                           popUpTo(Screen.Home.route)
                       }
            },
        maxLines = 1,fontSize = MaterialTheme.typography.h6.fontSize
        )

    }

}
@Preview(showBackground = true)
@Composable
fun DetailPreview(){}