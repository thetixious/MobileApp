package com.rmp.lab.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rmp.lab.R
import com.rmp.lab.data.entities.RoomDbEntity
import com.rmp.lab.data.util.RoomType

@Composable
fun RoomPreview(
    room: RoomDbEntity,
    onNextRoomClicked: (RoomDbEntity) -> Unit

) {
    var type: RoomType = room.roomType
    var imageId: Int = when (type) {
        RoomType.LIVING_ROOM -> R.drawable.living_room
        RoomType.KITCHEN -> R.drawable.kitchen
        RoomType.BED_ROOM -> R.drawable.bedroom
        RoomType.BATH_ROOM -> R.drawable.living_room
    }


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
                    painterResource(id =imageId),
                    alpha = 0.8f,
                    contentScale = ContentScale.FillBounds,
                )
        }.clickable {onNextRoomClicked(room) }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                modifier = Modifier.padding(start = 10.dp).shadow(elevation =55.dp),
                text = room.roomName,
                color = Color.Black,
                style = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold)
            )
        }

    }
}