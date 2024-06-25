package com.rmp.lab.ui.divices

import android.view.RoundedCorner
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rmp.lab.R

@Preview(showSystemUi = true)
@Composable
fun SmartLight() {
    val customColor = Color(0xFFFAE100)
    val shape = RoundedCornerShape(20.dp)
    Card(

        modifier = Modifier
            .width(160.dp)
            .height(100.dp).shadow(elevation = 2.dp, shape = shape, clip = false).clip(shape),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),

//        elevation = CardDefaults.cardElevation(
//            defaultElevation = 12.dp,
//        ),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.light),
                    contentDescription = null,
                    tint = customColor,
                    modifier = Modifier.size(35.dp)
                )
                Switch(
                    checked = true,
                    onCheckedChange = {},
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        checkedTrackColor = customColor,
                        uncheckedThumbColor = Color.White,
                        uncheckedTrackColor = Color.LightGray,
                        checkedBorderColor = customColor,
                        uncheckedBorderColor = Color.LightGray,
                    ),
                    modifier = Modifier.padding(end = 10.dp)

                )
            }
            Text(
                text = "Room Lights",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Black
            )
            Text(
                text = "5000K",
                style = MaterialTheme.typography.labelSmall,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 10.dp)
            )

        }
    }
}


