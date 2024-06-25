package com.rmp.lab.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rmp.lab.ui.divices.SmartConditioner
import com.rmp.lab.ui.divices.SmartLight
import com.rmp.lab.ui.divices.SmartSpeakers

@Preview(showSystemUi = true)
@Composable
fun RoomScreen() {
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
        LazyColumn(modifier = Modifier.padding(10.dp).fillMaxSize()) {
            item{
                SmartLight()
            }
            item{
                SmartConditioner()
            }
            item{
                SmartSpeakers()
            }
        }
    }

//    LazyColumn {
//
//
////        item {
////            MusicPlayerCard("The Git Up", "Blanco Brown")
////        }
//        item {
//            Card(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(8.dp)
//            ) {
//                Text(
//                    "Add a new device",
//                    modifier = Modifier
//                        .padding(16.dp)
//                        .fillMaxWidth(),
//                    textAlign = TextAlign.Center
//                )
//            }
//        }


}