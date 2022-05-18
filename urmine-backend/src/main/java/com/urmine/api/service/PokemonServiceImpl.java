package com.urmine.api.service;

import com.urmine.api.response.pokemon.PokemonGetRes;
import com.urmine.db.repository.PokemonEvolutionRepository;
import com.urmine.db.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * Pokemon 정보 관리를 위한 ServiceImpl
 */
@Service
public class PokemonServiceImpl implements PokemonService {
    @Autowired
    PokemonRepository pokemonRepository;
    @Autowired
    PokemonEvolutionRepository pokemonEvolutionRepository;

    @Override
    public List<PokemonGetRes> findAllPokemon() {
        /*
         * 모든 포켓몬의 정보를 조회하는 메소드
         */

        // TODO Add more

        return null;
    }
}
