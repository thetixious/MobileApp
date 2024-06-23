package com.rmp.lab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rmp.lab.ui.screen.AddNewRoom
import com.rmp.lab.ui.screen.MainPage
import com.rmp.lab.ui.theme.SmarthouseTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmarthouseTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "MainPage") {

                        composable(route = "AddNewRoom"){
                            AddNewRoom()
                        }
                        composable(route="MainPage"){
                            MainPage()
                        }


                    }

                }
            }
        }
    }
}

