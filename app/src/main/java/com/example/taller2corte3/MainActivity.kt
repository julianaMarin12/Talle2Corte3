package com.example.taller2corte3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.taller2corte3.ui.PokemonListScreen
import com.example.taller2corte3.ui.theme.Taller2Corte3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Taller2Corte3Theme {
                PokemonListScreen()
            }
        }
    }
}