package edu.uade.primerparcial.viewModel

import androidx.lifecycle.ViewModel
import edu.uade.primerparcial.domain.usecase.GetPokemonsUseCase
import edu.uade.primerparcial.repository.PokemonRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class PokemonViewModel(
    private val getPokemonsUseCase: GetPokemonsUseCase = GetPokemonsUseCase(PokemonRepositoryImpl())
) : ViewModel() {
    private val _uiState = MutableStateFlow(PokemonUiState(isLoading = true))
    val uiState: StateFlow<PokemonUiState> = _uiState.asStateFlow()

    init {
        loadPokemons()
    }

    private fun loadPokemons() {
        _uiState.value = _uiState.value.copy(
            pokemons = getPokemonsUseCase(),
            isLoading = false,
            errorMessage = null
        )
    }
}

