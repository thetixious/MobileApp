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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun CreateRoomForm() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),

        ) {
        Text(
            text = "Add room",
            style = TextStyle(fontSize = 35.sp, fontWeight = FontWeight.Bold)
        )
        Text(
            modifier = Modifier.padding(top = 10.dp),
            text = "Choose type of room",
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )
        Column(Modifier.selectableGroup()) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(selected = false, onClick = { /*TODO*/ })
                Text(
                    text = "Living Room",
                    style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Normal)
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(selected = false, onClick = { /*TODO*/ })
                Text(
                    text = "Kitchen",
                    style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Normal)
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(selected = false, onClick = { /*TODO*/ })
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
            value = "",
            onValueChange = {},
            modifier = Modifier
                .padding(top = 10.dp)
                .height(40.dp),
            shape = RoundedCornerShape(10.dp),


            )

        Button(
            onClick = {},
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
