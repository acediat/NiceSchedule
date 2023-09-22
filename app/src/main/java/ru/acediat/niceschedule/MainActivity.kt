package ru.acediat.niceschedule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import ru.acediat.niceschedule.navigation.NavGraph
import ru.acediat.niceschedule.ui.theme.NiceScheduleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NiceScheduleTheme {
                NavGraph(navController)
            }
        }
    }
}