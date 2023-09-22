package ru.acediat.niceschedule.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.acediat.niceschedule.ui.theme.SimpleListItem

@Composable
fun ScheduleScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(10) {
            ScheduleEventItem()
        }
    }
}

@Composable
private fun ScheduleEventItem() {
    SimpleListItem {
        Column {
            Text("Title")
            Text("Description")
        }
    }
}