package com.urmine.api.service;

import com.urmine.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/*
 * 유저 정보 관리를 위한 ServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {
    @Value("${spring.security.oauth2.client.registration.kakao.client-id}")
    private String kakaoClientId;
    @Value("${spring.security.oauth2.client.registration.kakao.client-secret}")
    private String kakaoClientSecret;
    @Value("${spring.security.oauth2.client.registration.kakao.client-authentication-method}")
    private String kakaoAuthenticationMethod;
    @Value("${spring.security.oauth2.client.registration.kakao.authorization-grant-type}")
    private String kakaoGrantType;
    @Value("${spring.security.oauth2.client.registration.kakao.redirect-uri}")
    private String kakaoRedirectUri;
    @Value("${spring.security.oauth2.client.provider.kakao.authorization-uri}")
    private String kakaoAuthorizationUri;
    @Value("${spring.security.oauth2.client.provider.kakao.token-uri}")
    private String kakaoTokenUri;
    @Value("${spring.security.oauth2.client.provider.kakao.user-info-uri}")
    private String kakaoUserInfoUri;
    @Value("Bearer")
    private String tokenType;

    @Autowired
    private UserRepository userRepository;

    @Override
    public String getKakaoLoginPage() {
        /*
         * 카카오 로그인 페이지 URL을 반환하는 메소드
         */

        return kakaoAuthorizationUri + "?client_id=" + kakaoClientId + "&redirect_uri=" + kakaoRedirectUri + "&response_type=code";
    }

    @Override
    public HashMap<String, String> getKakaoTokens(String code) {
        /*
         * code를 이용하여 accessToken, refreshToken을 받아오는 메소드
         */
        String accessToken = "";
        String refreshToken = "";

        // TODO Add more

        HashMap<String, String> tokens = new HashMap<>();
        tokens.put("accessToken", accessToken);
        tokens.put("refreshToken", refreshToken);

        return tokens;
    }
}
