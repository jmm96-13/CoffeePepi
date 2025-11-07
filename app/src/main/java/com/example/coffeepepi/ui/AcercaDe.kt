package com.example.coffeepepi.ui

package com.example.coffeepepi.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeepepi.R
import com.example.coffeepepi.ui.theme.CoffeePepiTheme

@Composable
fun AcercaDe() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Logo o imagen representativa
        Image(
            painter = painterResource(R.drawable.pepiscoffee_logo),
            contentDescription = "Logo CoffeePepi",
            modifier = Modifier.size(180.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Título
        Text(
            text = "Acerca de CoffeePepi",
            fontSize = 22.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Información del autor y licencia
        Text(
            text = "Aplicación desarrollada por Pepi Macías\n" +
                    "Licencia: Uso educativo\n" +
                    "Versión 1.0",
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAcercaDe() {
    CoffeePepiTheme {
        AcercaDe()
    }
}
