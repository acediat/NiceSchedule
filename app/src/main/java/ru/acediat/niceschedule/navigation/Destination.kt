package ru.acediat.niceschedule.navigation

sealed class Destination(val route: String) {
    object Schedule: Destination(route = "schedule")
}