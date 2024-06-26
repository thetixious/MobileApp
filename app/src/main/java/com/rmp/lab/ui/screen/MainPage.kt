package com.rmp.lab.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.rmp.lab.viewModel.AppViewModel
import java.text.DateFormatSymbols
import java.util.Calendar
import java.util.Locale


@Composable
fun MainPage(navController: NavController) {
    val viewModel:AppViewModel = viewModel(factory = AppViewModel.factory)
    val allRooms = viewModel.roomList
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Text(
            text = getCurrentDate(),
            modifier = Modifier.padding(start = 10.dp, top = 20.dp),
            style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.Gray)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "My rooms",
                style = TextStyle(fontSize = 35.sp, fontWeight = FontWeight.Bold)

            )
        }
        Column{
            if (allRooms.isNotEmpty()){
                for (room in allRooms){
                    RoomPreview(room){
                        navController.navigate("RoomScreen" + "${room.id}")
                    }
                }
            }

            AddNewRoom(navController)

        }

    }

}

fun getCurrentDate(): String {
    val calendar = Calendar.getInstance()
    val day = calendar.get(Calendar.DAY_OF_MONTH)
    val month = calendar.get(Calendar.MONTH)
    val year = calendar.get(Calendar.YEAR)
    val monthName = DateFormatSymbols().months[month].replaceFirstChar { it.uppercase(Locale.ENGLISH) }
    return "$monthName ${day}, $year"
}

