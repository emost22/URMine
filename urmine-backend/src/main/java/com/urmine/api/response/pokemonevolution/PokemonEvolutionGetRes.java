package com.urmine.api.response.pokemonevolution;

import com.urmine.db.entity.PokemonEvolution;
import lombok.Builder;
import lombok.Data;

/*
 * 특정 포켓몬의 진화 정보를 조회하기 위한 ResponseDto
 */
@Data
@Builder
public class PokemonEvolutionGetRes {
    private Long pokemonId;
    private String firstMethod;
    private Long firstEvolutionId;
    private String secondMethod;
    private Long secondEvolutionId;

    public static PokemonEvolutionGetRes of(PokemonEvolution pokemonEvolution) {
        /*
         * PokemonEvolution Entity를 PokemonEvolutionGetResponseDto로 변환하는 메소드
         */

        if (pokemonEvolution == null) return null;

        return PokemonEvolutionGetRes.builder()
                .pokemonId(pokemonEvolution.getPokemon().getPokemonId())
                .firstMethod(pokemonEvolution.getFirstMethod())
                .firstEvolutionId(pokemonEvolution.getFirstEvolutionId())
                .secondMethod(pokemonEvolution.getSecondMethod())
                .secondEvolutionId(pokemonEvolution.getSecondEvolutionId())
                .build();
    }
}
