package com.yusril.plantys.component.bottomnav

import com.yusril.plantys.R

sealed class BottomNavItem(var title:String, var icon:Int, var route:String ) {
    object Home : BottomNavItem("Home", R.drawable.ic_launcher_background,"home")
    object Reminder : BottomNavItem("Reminder",R.drawable.ic_launcher_foreground,"")
}