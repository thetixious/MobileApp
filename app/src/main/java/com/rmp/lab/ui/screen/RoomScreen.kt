package com.rmp.lab.ui.screen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.rmp.lab.ui.divices.PlayerCard
import com.rmp.lab.ui.divices.SmartConditioner
import com.rmp.lab.ui.divices.SmartLight
import com.rmp.lab.ui.divices.SmartSpeakers

@Composable
fun RoomScreen(
    roomId: Int,
    navController: NavController
) {
    val shape = RoundedCornerShape(20.dp)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Text(
            "Media Room",
            style = TextStyle(fontSize = 35.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(16.dp)
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .padding(10.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)

        ) {
            item {
                SmartLight()
            }
            item {
                SmartConditioner()
            }
            item {
                SmartSpeakers()
            }
            item(span = { GridItemSpan(2) }) {
                PlayerCard()
            }
            item(span = { GridItemSpan(2) }) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .shadow(elevation = 8.dp, shape = shape, clip = false)
                        .clip(shape),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White,
                    ),

                    ) {
                    Text(
                        "Add a new device",
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center,

                        )
                }
            }
        }


    }
}



