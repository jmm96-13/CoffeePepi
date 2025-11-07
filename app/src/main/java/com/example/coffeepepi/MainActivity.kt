package com.example.coffeepepi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.coffeepepi.ui.AppCoffee
import com.example.coffeepepi.ui.theme.CoffeePepiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoffeePepiTheme {
                AppCoffee()
                }
            }
        }
    }