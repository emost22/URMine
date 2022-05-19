package com.urmine.api.controller;

import com.urmine.api.response.pokemon.PokemonGetRes;
import com.urmine.api.service.PokemonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * 포켓몬 정보 관리를 위한 RestController
 */
@RestController
@RequestMapping("/api/pokemon")
@CrossOrigin(value = {"*"}, maxAge = 6000)
@Api(value = "PokemonController", description = "포켓몬 컨트롤러")
public class PokemonController {
    @Autowired
    PokemonService pokemonService;

    @GetMapping("")
    @ApiOperation(value = "모든 포켓몬 정보 조회", notes = "모든 포켓몬의 정보를 조회한다.")
    @ApiResponses(
            @ApiResponse(code = 200, message = "1 ~ 151번 포켓몬의 정보가 성공적으로 조회되었음")
    )
    public ResponseEntity<List<PokemonGetRes>> findAllPokemon() {
        /*
         * 모든 포켓몬의 정보를 조회하는 메소드
         */

        // TODO Add more

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
