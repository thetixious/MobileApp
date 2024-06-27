package com.rmp.lab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.rmp.lab.ui.form.CreateRoomForm
import com.rmp.lab.ui.screen.AddNewRoom
import com.rmp.lab.ui.screen.MainPage
import com.rmp.lab.ui.screen.RoomScreen
import com.rmp.lab.ui.theme.SmarthouseTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmarthouseTheme {
                Scaffold { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "MainPage",
                        modifier = Modifier
                            .fillMaxSize()
//                            .verticalScroll(rememberScrollState())
                            .padding(innerPadding),
                        ) {

                        composable(
                            route = "RoomScreen" + "{roomId}" ,
                            arguments = listOf (navArgument("roomId") {
                                type = NavType.IntType
                            })
                        ) {
                            backStackEntry ->
                            val roomId = backStackEntry.arguments?.getInt("roomId")
                            RoomScreen(roomId!!,navController)
                        }

                        composable(route = "AddNewRoom") {
                            AddNewRoom(navController)
                        }
                        composable(route = "MainPage") {
                            MainPage(navController)
                        }
                        composable(route = "CreateRoomForm") {
                            CreateRoomForm(navController)
                        }


                    }

                }
            }
        }
    }
}

