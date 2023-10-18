package com.yusril.plantys.component

import android.app.Activity
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yusril.plantys.component.bottomnav.BottomNavItem
import com.yusril.plantys.data.database.DataDummyPlant
import com.yusril.plantys.view.Home


@Composable
fun PlantMainApp(){
    val navController = rememberNavController()
    PlantNavHost(navController = navController)
}

@Composable
fun PlantNavHost(navController: NavHostController){
//    val activity = (LocalContext.current as Activity)
    NavHost(navController = navController, startDestination = BottomNavItem.Home.route ){
        composable("home"){
            Home(navHostController = navController, plantList = DataDummyPlant.plantList )
        }
    }
}