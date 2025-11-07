package com.example.coffeepepi.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun AppCoffee() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("CoffeePepi") }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )
}

@Preview(showBackground = true), name = "Claro"
@Composable
fun PreviewClaro() {
    CoffeePepiTheme(darkTheme = false) { AppCoffee() }
}

@Preview(showBackground = true), name = "Oscuro"
@Composable
fun PreviewClaro() {
    CoffeePepiTheme(darkTheme = false) { AppCoffee() }
}