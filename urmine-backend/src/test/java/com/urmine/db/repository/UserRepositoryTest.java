package com.urmine.db.repository;

import com.urmine.db.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    void findUserByAccountEmail() {
        // given
        String accountEmail = "example@gmail.com";
        String nickname = "example";
        String profileImageUrl = "http://k.kakaocdn.net/dn/dpk9l1/btqmGhA2lKL/Oz0wDuJn1YV2DIn92f6DVK/img_640x640.jpg";
        String accessToken = "RYRHH1rnkSpdnkmIcdPAHJrlp3tq74WaoCy_OgE9CisNIAAAAYD08vNP";
        String refreshToken = "fUaOVMBUJxQkEjPaKO1koFv5fBdXjdaGS6tld2K8CisNIAAAAYD08vNP";
        User newUser = new User();
        newUser.setAccountEmail(accountEmail);
        newUser.setNickname(nickname);
        newUser.setProfileImageUrl(profileImageUrl);
        newUser.setAccessToken(accessToken);
        newUser.setRefreshToken(refreshToken);

        // then
        newUser = userRepository.save(newUser);
        User user = userRepository.findUserByAccountEmail(accountEmail).orElse(null);

        // when
        assertThat(user.getAccountEmail()).isEqualTo(newUser.getAccountEmail());
        assertThat(user.getNickname()).isEqualTo(newUser.getNickname());
    }
}
