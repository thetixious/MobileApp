package com.rmp.lab.ui.screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rmp.lab.R

@Preview(showSystemUi = true)
@Composable
fun AddNewRoom() {
    val shape = RoundedCornerShape(10.dp)
    Box(contentAlignment = Alignment.Center,
        modifier = with(Modifier) {
            fillMaxWidth()
                .padding(10.dp)
                .height(100.dp)
                .shadow(elevation = 5.dp, shape = shape, clip = false)
                .background(color = Color.White, shape = shape)
                .clip(shape)
                .paint(
                    painterResource(id = R.drawable.living_room),
                    alpha = 0.4f,
                    contentScale = ContentScale.FillBounds,
                )
        }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.add),
                contentDescription = "next",
                modifier = Modifier
                    .size(24.dp)

            )
        Text(
            modifier = Modifier.padding(start=10.dp),
            text = "Add new room",
            color = Color.Gray,
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Light)
        )
        }

    }
}

