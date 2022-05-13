package com.urmine.api.service;

import com.urmine.api.response.UserGetRes;

import java.util.HashMap;

/*
 * 유저 정보 관리를 위한 Service
 */
public interface UserService {
    public String getKakaoLoginPage();
    public HashMap<String, String> getKakaoTokens(String code);
    public UserGetRes getUserInfo(HashMap<String, String> tokens);
    public UserGetRes findUserByAccountEmail(String accountEmail);
    public UserGetRes insertUser(UserGetRes userGetRes);
}
