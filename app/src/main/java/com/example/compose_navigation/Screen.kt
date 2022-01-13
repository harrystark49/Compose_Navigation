package com.example.compose_navigation

import android.util.Log

const val DETAIL_ARGUMENT_KEY="id"
const val DETAIL_ARGUMENT_KEY2="name"

const val Route_route="root"
const val Home_route="home"
const val Authencation_Route="auth"
sealed class Screen (var route:String){
    object Home:Screen("Home_Screen")
    object Login:Screen("Login_Screen")
    object SignUp:Screen("SignUp_Screen")
    //required arguments
//    object Detail:Screen(route = "Detail_Screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}"){
    object Detail:Screen(route = "Detail_Screen?id={id}&name={name}")
//        fun getid(id:Int):String{
//            Log.d("val","${this.route.replace("{$DETAIL_ARGUMENT_KEY}",newValue = id.toString())}")
////            return "Detail_Screen/$id"
//            return this.route.replace("{$DETAIL_ARGUMENT_KEY}",newValue = id.toString())
////            return this.route.replace("${DETAIL_ARGUMENT_KEY}",newValue = id.toString())
//        }
    //required
//        fun getIdAndName(id:Int,name:String):String{
//            return "Detail_Screen/$id/$name"
//        }
//    }

    //Optional
//    fun getdata(id:Int=0):String{
//        return "Detail_Screen?id=$id"
//    }
    fun getNameAndId(id:Int=0,name:String=" "):String{
        return "Detail_Screen?id=$id&name=$name"
    }
}

//we can the pass arguments using 2 ways -required arguments and - option arguments