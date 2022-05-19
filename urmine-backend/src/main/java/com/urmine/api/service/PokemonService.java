package com.urmine.api.service;

import com.urmine.api.response.pokemon.PokemonGetRes;

import java.util.List;

/*
 * Pokemon 정보 관리를 위한 Service
 */
public interface PokemonService {
    public List<PokemonGetRes> findAllPokemon();
}
