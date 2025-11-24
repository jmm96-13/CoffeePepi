package com.example.coffeepepi.datos

import android.content.Context
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.configDataStore: androidx.datastore.core.DataStore<Preferences> by preferencesDataStore(
    name = "config_coffeepepi"
)

class ConfiguracionDataStore(private val context: Context) {

    companion object {
        val NOTIFICATIONS_KEY = booleanPreferencesKey("notifications_enabled")
    }

    val notificationsFlow: Flow<Boolean> = context.configDataStore.data
        .map { prefs ->
            prefs[NOTIFICATIONS_KEY] ?: false
        }

    suspend fun saveNotifications(enabled: Boolean) {
        context.configDataStore.edit { prefs ->
            prefs[NOTIFICATIONS_KEY] = enabled
        }
    }
}
