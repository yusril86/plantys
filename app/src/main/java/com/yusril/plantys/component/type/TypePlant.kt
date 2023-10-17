package com.yusril.plantys.component.type

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yusril.plantys.R


@Composable
fun TypePlant(type: String) {
    Box(
        modifier = Modifier
            .wrapContentWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(colorResource(id = R.color.purple_200))
    ) {
        Text(
            text = type,
            modifier = Modifier.padding(12.dp, 6.dp, 12.dp, 6.dp),
            style =MaterialTheme.typography.caption,
            color =  colorResource(id = R.color.white)
        )
    }
}

@Preview
@Composable
fun PreviewTypePlant(){
    TypePlant(type = "Rambat")
}