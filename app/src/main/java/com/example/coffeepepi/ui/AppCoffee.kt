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
import androidx.compose.foundation.background
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.res.stringResource

@Composable
fun AppCoffee() {
    val context = LocalContext.current
    val acercaDe = context.getString(R.string.about_title)
    val sobreNosotros = "Sobre Nosotros"

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(60.dp))

            //logo
            Image(
                painter = painterResource(R.drawable.pepiscoffee_logo),
                contentDescription = null,
                modifier = Modifier.size(160.dp)
            )

            Spacer(Modifier.height(24.dp))

            // Botón Acerca de
            Button(onClick = { }) {
                Text(stringResource(R.string.about_title))
            }

            // Botón Sobre Nosotros
            Button(onClick = { }) {
                Text(stringResource(R.string.about_us_title))
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