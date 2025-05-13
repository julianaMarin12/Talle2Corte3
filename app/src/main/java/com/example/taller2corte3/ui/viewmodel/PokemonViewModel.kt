package com.example.taller2corte3.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.taller2corte3.data.Pokemon
import com.example.taller2corte3.data.RetrofitClient
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class PokemonViewModel : ViewModel() {
    private val _pokemons = MutableStateFlow<List<Pokemon>>(emptyList())
    val pokemons: StateFlow<List<Pokemon>> = _pokemons

    init {
        viewModelScope.launch {
            try {
                val response = RetrofitClient.api.getPokemons()
                _pokemons.value = response.results
            } catch (e: Exception) {
            }
        }
    }
}