package com.example.coffeepepi.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeepepi.R
import com.example.coffeepepi.ui.theme.CoffeePepiTheme


@Composable
fun AppCoffee() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //logo
            Image(
                painter = painterResource(R.drawable.pepiscoffee_logo),
                contentDescription = null,
                modifier = Modifier.size(160.dp)
            )

            Spacer(Modifier.height(24.dp))

            // Botón Acerca de
            Button(onClick = { }) {
                Text("Acerca de")
            }
        }
    }

@Preview(name = "Claro", showBackground = true)
@Composable
fun PreviewClaro() {
    CoffeePepiTheme(darkTheme = false) { AppCoffee() }
}

@Preview(name = "Oscuro", showBackground = true)
@Composable
fun PreviewOscuro() {
    CoffeePepiTheme(darkTheme = true) { AppCoffee() }
}