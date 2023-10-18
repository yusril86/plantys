package com.yusril.plantys.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.yusril.plantys.component.plantlist.PlantItem
import com.yusril.plantys.data.model.Plants

@Composable
fun Home(navHostController: NavHostController, plantList: List<Plants>) {
    LazyColumn {
        items(plantList) { plant ->
            PlantItem(plant = plant, onItemClicked = {

            })
        }
    }
}