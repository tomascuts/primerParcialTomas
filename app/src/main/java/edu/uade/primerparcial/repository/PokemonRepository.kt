package edu.uade.primerparcial.repository

import edu.uade.primerparcial.domain.model.Pokemon

interface PokemonRepository {
    fun getPokemons(): List<Pokemon>
}

