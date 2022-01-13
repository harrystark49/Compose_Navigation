package com.example.compose_navigation.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.compose_navigation.Authencation_Route
import com.example.compose_navigation.Screen

@Composable
fun HomeScreen(navcontroller:NavHostController){
    Box(modifier = Modifier
        .fillMaxSize(),contentAlignment = Alignment.Center) {
        Column() {
            Text(text = "HomeScreen",maxLines = 1,fontSize = MaterialTheme.typography.h6.fontSize,
                modifier = Modifier
                    .clickable {
//                navcontroller.navigate(Screen.Detail.getid(5))
//                navcontroller.navigate(Screen.Detail.getIdAndName(1,"harry"))
                        navcontroller.navigate(Screen.Detail.getNameAndId(5,"harry"))
                    })

            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "login/signUp", Modifier.clickable {
                navcontroller.navigate(Authencation_Route)
            })
        }

    }
}
@Preview(showBackground = true)
@Composable
fun homepreveiw(){
}