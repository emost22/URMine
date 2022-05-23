package com.urmine.api.response.pokemon;

import com.urmine.api.response.pokemonevolution.PokemonEvolutionGetRes;
import com.urmine.api.response.pokemonpicture.PokemonPictureGetRes;
import com.urmine.api.response.pokemontype.PokemonTypeGetRes;
import com.urmine.db.entity.Pokemon;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

/*
 * 포켓몬의 정보를 조회하기 위한 ResponseDto
 */
@Data
@Builder
public class PokemonGetRes {
    private Long pokemonId;
    private String pokemonName;
    private String kind;
    private String color;
    private String description;
    private List<PokemonEvolutionGetRes> pokemonEvolutionGetResList;
    private List<PokemonTypeGetRes> pokemonTypeGetResList;
    private List<PokemonPictureGetRes> pokemonPictureGetResList;

    public static PokemonGetRes of(Pokemon pokemon) {
        /*
         * Pokemon Entity를 PokemonGetResponseDto로 변환하는 메소드
         * pokemonEvolution은 PokemonService에서 조회
         */

        return PokemonGetRes.builder()
                .pokemonId(pokemon.getPokemonId())
                .pokemonName(pokemon.getPokemonName())
                .kind(pokemon.getKind())
                .color(pokemon.getColor())
                .description(pokemon.getDescription())
                .pokemonTypeGetResList(pokemon.getPokemonTypeList().stream().map(pokemonType -> PokemonTypeGetRes.of(pokemonType)).collect(Collectors.toList()))
                .pokemonPictureGetResList(pokemon.getPokemonPictureList().stream().map(pokemonPicture -> PokemonPictureGetRes.of(pokemonPicture)).collect(Collectors.toList()))
                .build();
    }
}
