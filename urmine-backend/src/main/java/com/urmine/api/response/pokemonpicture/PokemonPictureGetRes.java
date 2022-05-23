package com.urmine.api.response.pokemonpicture;

import com.urmine.db.entity.PokemonPicture;
import lombok.Builder;
import lombok.Data;

/*
 * 특정 포켓몬의 이미지 URL을 조회하기 위한 ResponseDto
 */
@Data
@Builder
public class PokemonPictureGetRes {
    private Long pokemonId;
    private Integer pokemonNum;
    private String pokemonGrayImageUrl;
    private String pokemonColorImageUrl;

    public static PokemonPictureGetRes of(PokemonPicture pokemonPicture) {
        /*
         * PokemonPicture Entity를 PokemonPictureGetResponseDto로 변환하는 메소드
         */

        return PokemonPictureGetRes.builder()
                .pokemonId(pokemonPicture.getPokemon().getPokemonId())
                .pokemonNum(pokemonPicture.getPokemonNum())
                .pokemonGrayImageUrl(pokemonPicture.getPokemonGrayImageUrl())
                .pokemonColorImageUrl(pokemonPicture.getPokemonColorImageUrl())
                .build();
    }
}
