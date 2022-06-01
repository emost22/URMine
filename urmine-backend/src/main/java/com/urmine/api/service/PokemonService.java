package com.urmine.api.service;

import com.urmine.api.response.pokemon.PokemonGetRes;
import com.urmine.api.response.pokemonevolution.PokemonEvolutionGetRes;

import java.util.List;

/*
 * Pokemon 정보 관리를 위한 Service
 */
public interface PokemonService {
    public List<PokemonGetRes> findAllPokemon();
    public List<PokemonEvolutionGetRes> getPokemonEvolution(Long pokemonId);
    public PokemonGetRes findPokemonByPokemonId(Long pokemonId);
}
