package edu.uade.primerparcial.viewModel

import edu.uade.primerparcial.domain.model.Pokemon

data class PokemonUiState(
    val pokemons: List<Pokemon> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)

