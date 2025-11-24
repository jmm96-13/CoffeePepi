package com.example.coffeepepi.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeepepi.R
import com.example.coffeepepi.ui.theme.CoffeePepiTheme
import com.example.coffeepepi.datos.ConfiguracionDataStore
import kotlinx.coroutines.launch

@Composable
fun Configuracion() {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val dataStore = remember { ConfiguracionDataStore(context) }

    var notificacionesActivas by rememberSaveable { mutableStateOf(false) }

    LaunchedEffect(notificacionesGuardadas.value) {
        notificacionesActivas = notificacionesGuardadas.value
    }

    val notificacionesGuardadas =
        dataStore.notificationsFlow.collectAsState(initial = false)

    //val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = stringResource(R.string.config_title),
            style = MaterialTheme.typography.headlineMedium
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(R.string.config_notifications),
                modifier = Modifier.weight(1f)
            )
            Switch(
                checked = notificacionesActivas,
                onCheckedChange = { checked ->
                    notificacionesActivas = checked
                }
            )
        }

        Spacer(Modifier.height(16.dp))

        // Botón para GUARDAR en DataStore (como Save Email)
        Button(
            onClick = {
                scope.launch {
                    dataStore.saveNotifications(notificacionesActivas)
                }
            }
        ) {
            Text(text = stringResource(R.string.config_save))
        }

        Spacer(Modifier.height(24.dp))

        // Mostrar lo que hay GUARDADO en DataStore (equivalente a userEmail.value!!)
        Text(
            text = if (notificacionesGuardadas.value)
                stringResource(R.string.config_notifications_on)
            else
                stringResource(R.string.config_notifications_off),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewConfiguracion() {
    CoffeePepiTheme {
        Configuracion()
    }
}
