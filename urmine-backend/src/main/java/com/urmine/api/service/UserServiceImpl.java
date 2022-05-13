package com.urmine.api.service;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.urmine.api.response.UserGetRes;
import com.urmine.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
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

        try {
            URL url = new URL(kakaoTokenUri);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod(kakaoAuthenticationMethod);
            conn.setDoOutput(true);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
            StringBuilder sb = new StringBuilder();
            sb.append("grant_type=" + kakaoGrantType);
            sb.append("&client_id=" + kakaoClientId);
            sb.append("&client_secret=" + kakaoClientSecret);
            sb.append("&redirect_uri=" + kakaoRedirectUri);
            sb.append("&code=" + code);
            bw.write(sb.toString());
            bw.flush();

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            String result = "";

            while ((line = br.readLine()) != null) {
                result += line;
            }

            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);

            accessToken = element.getAsJsonObject().get("access_token").getAsString();
            refreshToken = element.getAsJsonObject().get("refresh_token").getAsString();

            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        HashMap<String, String> tokens = new HashMap<>();
        tokens.put("accessToken", accessToken);
        tokens.put("refreshToken", refreshToken);

        return tokens;
    }

    @Override
    public UserGetRes getUserInfo(HashMap<String, String> tokens) {
        /*
         * 카카오에서 유저 정보를 가져와 반환하는 메소드
         */

        JsonElement element = null;
        String email = "";

        // TODO Add more

        return null;
    }

    @Override
    public UserGetRes findUserByAccountEmail(String accountEmail) {
        /*
         * accountEmail으로 User를 검색하여 이미 존재하는 유저인지 검색하는 메소드
         */

        // TODO Add more

        return null;
    }
}
