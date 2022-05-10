package com.urmine.api.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

/*
 * 유저 정보 관리를 위한 RestController
 */
@RestController
@RequestMapping("/api/user")
@CrossOrigin(value = {"*"}, maxAge = 6000)
@Api(value = "UserController", description = "유저 컨트롤러")
public class UserController {

}
