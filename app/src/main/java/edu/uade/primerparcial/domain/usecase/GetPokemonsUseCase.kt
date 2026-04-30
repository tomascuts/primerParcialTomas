package edu.uade.primerparcial.domain.usecase

import edu.uade.primerparcial.domain.model.Pokemon
import edu.uade.primerparcial.repository.PokemonRepository

class GetPokemonsUseCase(
    private val repository: PokemonRepository
) {
    operator fun invoke(): List<Pokemon> = repository.getPokemons()
}

