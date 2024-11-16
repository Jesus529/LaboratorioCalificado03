package com.vargas.kevin.laboratoriocalificado03.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun LaboratorioCalificado03Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val DarkColorScheme = null
    val LightColorScheme = null
    (if (darkTheme) DarkColorScheme else LightColorScheme)?.let {
        MaterialTheme(
        colorScheme = it,
        typography = Typography,
        content = content
    )
    }
}
