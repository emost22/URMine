package com.urmine.api.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * 포켓몬 정보 관리를 위한 RestController
 */
@RestController
@RequestMapping("/api/pokemon")
@CrossOrigin(value = {"*"}, maxAge = 6000)
@Api(value = "PokemonController", description = "포켓몬 컨트롤러")
public class PokemonController {

}
