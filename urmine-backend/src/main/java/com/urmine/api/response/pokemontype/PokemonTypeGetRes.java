package com.urmine.api.response.pokemontype;

import com.urmine.db.entity.PokemonType;
import lombok.Builder;
import lombok.Data;

/*
 * 특정 포켓몬의 타입을 조회하기 위한 ResponseDto
 */
@Data
@Builder
public class PokemonTypeGetRes {
    private Long pokemonId;
    private Integer typeNumber;
    private String pokemonType;

    public static PokemonTypeGetRes of(PokemonType pokemonType) {
        /*
         * PokemonType Entity를 PokemonTypeGetResponseDto로 변환하는 메소드
         */

        return PokemonTypeGetRes.builder()
                .pokemonId(pokemonType.getPokemon().getPokemonId())
                .typeNumber(pokemonType.getTypeNumber())
                .pokemonType(pokemonType.getPokemonType())
                .build();
    }
}
