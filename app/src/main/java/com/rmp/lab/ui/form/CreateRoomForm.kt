package com.rmp.lab.ui.form

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.rmp.lab.data.util.RoomType
import com.rmp.lab.viewModel.AppViewModel

@Composable
fun CreateRoomForm(navController: NavHostController) {
    val viewModel: AppViewModel = viewModel(factory = AppViewModel.factory)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),

        ) {
        Text(
            text = "Add Room",
            style = TextStyle(fontSize = 35.sp, fontWeight = FontWeight.Bold)
        )
        Text(
            modifier = Modifier.padding(top = 10.dp),
            text = "Choose type of room",
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )
        Column(Modifier.selectableGroup()) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = viewModel.roomType === RoomType.LIVING_ROOM,
                    onClick = { viewModel.roomType = RoomType.LIVING_ROOM })
                Text(
                    text = "Living Room",
                    style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Normal)
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = viewModel.roomType === RoomType.KITCHEN,
                    onClick = { viewModel.roomType = RoomType.KITCHEN })
                Text(
                    text = "Kitchen",
                    style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Normal)
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = viewModel.roomType === RoomType.BED_ROOM,
                    onClick = { viewModel.roomType = RoomType.BED_ROOM })
                Text(
                    text = "Bedroom",
                    style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Normal)
                )
            }
        }
        Text(
            modifier = Modifier.padding(top = 10.dp),
            text = "Enter room name",
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )

        OutlinedTextField(
            value = viewModel.roomName,
            onValueChange = { viewModel.roomName = it },
            modifier = Modifier
                .padding(top = 8.dp)
                .height(50.dp),
            shape = RoundedCornerShape(10.dp),


            )

        Button(
            onClick = {
                navController.navigate("MainPage")
                viewModel.addRoom()
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = Color.DarkGray
            ),
            border = BorderStroke(
                width = 1.dp,
                brush = Brush.horizontalGradient(
                    listOf(
                        Color.Gray.copy(alpha = 0.5f),
                        Color.Gray.copy(alpha = 0.5f)
                    )
                )
            ),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.padding(top = 10.dp)
        )
        {
            Text(
                text = "Add",

                )
        }
    }


}
