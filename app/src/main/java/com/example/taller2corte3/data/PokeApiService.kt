package com.example.taller2corte3.data

import  com.example.taller2corte3.data.PokemonResponse
import retrofit2.http.GET

interface PokeApiService {
    @GET("pokemon?limit=10")
    suspend fun getPokemons(): PokemonResponse
}