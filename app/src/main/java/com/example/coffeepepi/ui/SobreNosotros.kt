package com.example.coffeepepi.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeepepi.R
import com.example.coffeepepi.ui.theme.CoffeePepiTheme

@Composable
fun SobreNosotros() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.about_us),
            contentDescription = "Logo CoffeePepi",
            modifier = Modifier.size(400.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Pepi´s Coffee es un pequeño rincón donde el café se convierte en arte",
            textAlign = TextAlign.Center
        )
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewSobreNosotros() {
    CoffeePepiTheme {
        SobreNosotros()
    }
}
