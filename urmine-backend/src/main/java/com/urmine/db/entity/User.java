package com.urmine.db.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    String accountEmail;
    String nickname;
    String profileImageUrl;
    String accessToken;
    String refreshToken;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List<UserBadge> userBadgeList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List<UserPokemon> userPokemonList = new ArrayList<>();
}
