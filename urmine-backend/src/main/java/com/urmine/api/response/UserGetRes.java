package com.urmine.api.response;

import com.google.gson.JsonElement;
import com.urmine.db.entity.User;
import lombok.Builder;
import lombok.Data;

import java.util.HashMap;

/*
 * 카카오 로그인 시 accountEmail로 유저를 검색하여 이미 가입한 유저인지 확인하기 위한 ResponseDto
 */
@Data
@Builder
public class UserGetRes {
    private String accountEmail;
    private String nickname;
    private String profileImageUrl;
    private String accessToken;
    private String refreshToken;

    public User toUser() {
        /*
         * DB에 접근하기 위해 UserGetResponseDto를 User Entity로 변환하는 메소드
         */

        User user = new User();
        user.setAccountEmail(this.accountEmail);
        user.setNickname(this.nickname);
        user.setProfileImageUrl(this.profileImageUrl);
        user.setAccessToken(this.accessToken);
        user.setRefreshToken(this.refreshToken);

        return user;
    }

    public static UserGetRes of(User user) {
        /*
         * User Entity를 UserGetResponseDto로 변환하는 메소드
         */

        return UserGetRes.builder()
                .accountEmail(user.getAccountEmail())
                .nickname(user.getNickname())
                .profileImageUrl(user.getProfileImageUrl())
                .accessToken(user.getAccessToken())
                .refreshToken(user.getRefreshToken())
                .build();
    }

    public static UserGetRes of(JsonElement element, String accountEmail, HashMap<String, String> tokens) {
        /*
         * 가져온 카카오 정보를 UserGetResponseDto로 변환하는 메소드
         */

        return UserGetRes.builder()
                .accountEmail(accountEmail)
                .nickname(element.getAsJsonObject().get("kakao_account").getAsJsonObject().get("profile").getAsJsonObject().get("nickname").getAsString())
                .profileImageUrl(element.getAsJsonObject().get("kakao_account").getAsJsonObject().get("profile").getAsJsonObject().get("profile_image_url").getAsString())
                .accessToken(tokens.get("accessToken"))
                .refreshToken(tokens.get("refreshToken"))
                .build();
    }
}
