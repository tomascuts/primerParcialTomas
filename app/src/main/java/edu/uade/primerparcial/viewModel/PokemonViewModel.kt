package edu.uade.primerparcial.viewModel

import androidx.lifecycle.ViewModel
import edu.uade.primerparcial.domain.Pokemon
import edu.uade.primerparcial.repository.PokemonRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class PokemonViewModel(
    private val repository: PokemonRepository = PokemonRepository()
) : ViewModel() {
    private val _pokemons = MutableStateFlow<List<Pokemon>>(emptyList())
    val pokemons: StateFlow<List<Pokemon>> = _pokemons.asStateFlow()

    init {
        loadPokemons()
    }

    private fun loadPokemons() {
        _pokemons.value = repository.getPokemons()
    }
}