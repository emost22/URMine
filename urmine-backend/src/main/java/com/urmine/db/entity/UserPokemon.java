package com.urmine.db.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@IdClass(UserPokemonId.class)
public class UserPokemon {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accountEmail")
    User user;
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "pokemonId", referencedColumnName = "pokemonId"),
            @JoinColumn(name = "pokemonNum", referencedColumnName = "pokemonNum")
    })
    PokemonPicture pokemonPicture;
    Integer pokemonCnt;
}
