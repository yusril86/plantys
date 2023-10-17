package com.yusril.plantys.component.plantlist

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yusril.plantys.R
import com.yusril.plantys.component.type.TypePlant
import com.yusril.plantys.data.model.Plants


@Composable
fun PlantItem(plant: Plants, onItemClicked: (plant: Plants) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clip(RoundedCornerShape(16.dp))
            .clickable(onClick = { onItemClicked(plant) }),
        elevation = 0.dp,
        backgroundColor = MaterialTheme.colors.onSurface
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            val imagePainter: Painter = painterResource(id = plant.image)
            Image(
                modifier = Modifier
                    .size(80.dp, 80.dp)
                    .clip(RoundedCornerShape(16.dp)),
                painter = imagePainter,
                contentDescription = "",
                alignment = Alignment.CenterStart,
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    text = plant.name,
                    modifier = Modifier.padding(0.dp, 0.dp, 12.dp, 0.dp),
                    color = MaterialTheme.colors.surface,
                    fontWeight = FontWeight.Bold,
                    style = typography.subtitle1
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    modifier = Modifier.padding(0.dp, 0.dp, 12.dp, 0.dp),
                    text = plant.latin,
                    color = MaterialTheme.colors.surface,
                    style = typography.caption
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth().align(Alignment.CenterVertically),
                horizontalArrangement = Arrangement.End) {
                TypePlant(type = plant.type)
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun PlantListPreview() {
    PlantItem(plant = Plants(
        id = 0,
        name = "Kamboja",
        description = "as",
        type = "Plant",
        latin = "This is plant make it easy",
        image = R.drawable.ic_launcher_foreground
    ), onItemClicked = {})
}
