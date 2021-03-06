package com.urmine.api.service;

import com.urmine.api.response.pokemonevolution.PokemonEvolutionGetRes;
import com.urmine.api.response.pokemon.PokemonGetRes;
import com.urmine.db.repository.PokemonEvolutionRepository;
import com.urmine.db.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

        List<PokemonGetRes> pokemonGetResList = pokemonRepository.findAll().stream()
                .map(pokemon -> PokemonGetRes.of(pokemon)).collect(Collectors.toList());

        int N = pokemonGetResList.size();
        for (int i = 0; i < N; i++) {
            long pokemonId = pokemonGetResList.get(i).getPokemonId();

            pokemonGetResList.get(i).setPokemonEvolutionGetResList(getPokemonEvolution(pokemonId));
        }

        return pokemonGetResList;
    }

    @Override
    public PokemonGetRes findPokemonByPokemonId(Long pokemonId) {
        /*
         * 특정 포켓몬의 정보를 조회하는 메소드
         */

        PokemonGetRes pokemonGetRes = PokemonGetRes.of(pokemonRepository.findById(pokemonId).orElse(null));
        pokemonGetRes.setPokemonEvolutionGetResList(getPokemonEvolution(pokemonGetRes.getPokemonId()));

        return pokemonGetRes;
    }

    public List<PokemonEvolutionGetRes> getPokemonEvolution(Long pokemonId) {
        /*
         * 해당 포켓몬의 진화 정보를 조회하는 메소드
         */

        return pokemonEvolutionRepository.findPokemonEvolutionByPokemon_PokemonIdOrFirstEvolutionIdOrSecondEvolutionId(pokemonId, pokemonId, pokemonId).stream()
                .map(pokemonEvolution -> PokemonEvolutionGetRes.of(pokemonEvolution)).collect(Collectors.toList());
    }
}
