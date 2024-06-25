package com.rmp.lab.ui.divices

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rmp.lab.R

@Preview
@Composable
fun PlayerCard() {
    val shape = RoundedCornerShape(20.dp)
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp).shadow(elevation = 8.dp, shape = shape, clip = false).clip(shape),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        )

    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(painter = painterResource(id = R.drawable.note), contentDescription = null)
                Spacer(modifier = Modifier.width(16.dp))
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "songName", style = MaterialTheme.typography.titleMedium, textAlign = TextAlign.Center)
                    Text(text = "artistName", style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center)
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                IconButton(onClick = {}) {
                    Icon(painter = painterResource(id = R.drawable.prev), contentDescription = "Previous")
                }
                IconButton(onClick = {}) {
                    Icon(painter = painterResource(id = R.drawable.pause), contentDescription = "Pause")
                }
                IconButton(onClick = {}) {
                    Icon(painter = painterResource(id = R.drawable.next), contentDescription = "Next")
                }
            }
        }
    }

}