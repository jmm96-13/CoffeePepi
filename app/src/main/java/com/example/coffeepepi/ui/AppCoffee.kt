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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.text.style.TextAlign

@Composable
fun AppCoffee() {
    val context = LocalContext.current
    val acercaDe = context.getString(R.string.about_title)
    val sobreNosotros = context.getString(R.string.about_us_title)
    val scrollState = rememberScrollState()

    Column(
       modifier = Modifier
           .fillMaxSize()
           .background(MaterialTheme.colorScheme.background)
           .padding(16.dp)
           .verticalScroll(scrollState),

            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(200.dp))

            //logo
            Image(
                painter = painterResource(R.drawable.pepiscoffee_logo),
                contentDescription = null,
                modifier = Modifier.size(160.dp)
            )

            Spacer(Modifier.height(24.dp))

            // Botón Acerca de
            Button(onClick = { }) {
                Text(acercaDe)
            }

            // Botón Sobre Nosotros
            Button(onClick = { }) {
                Text(sobreNosotros)

            }

            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus vehicula sem vitae risus pharetra, non iaculis lorem volutpat. Fusce mollis erat a ligula luctus, non tempus neque fermentum. Sed euismod dui sed augue varius, id hendrerit leo tristique. Nam consequat malesuada nunc, ac ullamcorper leo auctor non. Etiam laoreet dolor in nulla pharetra, a dictum sem aliquet. Cras cursus sapien vitae fringilla vulputate. Curabitur suscipit metus ut orci malesuada, nec feugiat leo pharetra.\n\nDonec convallis ipsum urna, id pharetra ipsum tincidunt et. Curabitur at ligula euismod tincidunt lorem vitae, malesuada lorem. Integer pretium, odio at venenatis dictum, nulla turpis rutrum lectus, ac fringilla lectus ex eget neque. Suspendisse potenti. Fusce iaculis magna ac nunc rhoncus, sed gravida nisl faucibus. Integer tincidunt tristique interdum.",
                textAlign = TextAlign.Center
            )

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