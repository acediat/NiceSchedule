package ru.acediat.niceschedule.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SimpleListItem(content: @Composable BoxScope.() -> Unit) = Box(
    modifier = Modifier
        .padding(all = 10.dp)
        .fillMaxWidth()
        .background(
            color = MaterialTheme.colorScheme.surface,
            shape = RoundedCornerShape(10)
        )
) {
    content()
}