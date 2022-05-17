package com.urmine.api.controller;

import com.urmine.api.response.user.UserGetRes;
import com.urmine.api.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.HashMap;

/*
 * 유저 정보 관리를 위한 RestController
 */
@RestController
@RequestMapping("/api/user")
@CrossOrigin(value = {"*"}, maxAge = 6000)
@Api(value = "UserController", description = "유저 컨트롤러")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/kakao/page")
    @ApiOperation(value = "카카오 로그인 페이지 URL 반환", notes = "카카오 로그인을 위한 URL을 반환하는 메소드")
    @ApiResponses({
            @ApiResponse(code = 200, message = "URL이 정상적으로 반환되었음")
    })
    public ResponseEntity<String> getKakaoLoginPage() {
        /*
         * 카카오 로그인 페이지 URL을 반환하는 메소드
         */

        return new ResponseEntity<>(userService.getKakaoLoginPage(), HttpStatus.OK);
    }

    @GetMapping("/kakao/login")
    @ApiOperation(value = "토근을 받아 회원 가입 or 로그인", notes = "카카오 로그인을 해서 받은 code로 토큰을 받고, 회원가입 or 로그인을 시도하는 메소드")
    @ApiResponses({
            @ApiResponse(code = 200, message = "정상적으로 로그인 되었음"),
            @ApiResponse(code = 201, message = "정상적으로 회원가입 되었음")
    })
    public ResponseEntity<UserGetRes> getTokensAndSignUpOrLogin(@RequestParam String code) throws Exception {
        /*
         * 카카오 로그인을 위해 토큰을 받아오고, 회원가입 or 로그인을 하는 메소드
         */

        // code를 이용하여 accessToken, refreshToken을 받아온다.
        HashMap<String, String> tokens = userService.getKakaoTokens(code);

        // 받은 tokens를 이용하여 유저 정보를 받아온다.
        UserGetRes userGetRes = userService.getUserInfo(tokens);

        // 받은 유저 정보의 accountEmail을 이용하여 이미 가입한 유저인지 확인한다. (확인한 유저 객체를 받아온다.)
        UserGetRes findUser = userService.findUserByAccountEmail(userGetRes.getAccountEmail());
        UserGetRes newUserGetRes = null;
        if (findUser == null) {
            // 유저 정보가 없으므로 회원 가입
            newUserGetRes = userService.insertUser(userGetRes);
            return new ResponseEntity<>(newUserGetRes, HttpStatus.CREATED);
        }
        else{
            // 유저 정보가 있으므로 토큰 갱신
            newUserGetRes = userService.updateUserToken(userGetRes.getAccountEmail(), tokens);
            return new ResponseEntity<>(newUserGetRes, HttpStatus.OK);
        }
    }
}
