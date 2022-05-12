package com.urmine.api.service;

import java.util.HashMap;

/*
 * 유저 정보 관리를 위한 Service
 */
public interface UserService {
    public String getKakaoLoginPage();
    public HashMap<String, String> getKakaoTokens(String code);
}
