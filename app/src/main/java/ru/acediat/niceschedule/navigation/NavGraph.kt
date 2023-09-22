package ru.acediat.niceschedule.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.acediat.niceschedule.ui.screens.ScheduleScreen
import ru.acediat.niceschedule.ui.theme.NiceScheduleTheme

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Destination.Schedule.route) {
        composable(Destination.Schedule.route) {
            ScheduleScreen()
        }
    }
}
