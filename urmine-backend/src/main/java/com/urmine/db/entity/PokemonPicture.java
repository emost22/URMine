package com.urmine.db.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@IdClass(PokemonPictureId.class)
public class PokemonPicture {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pokemonId")
    Pokemon pokemon;
    @Id
    Integer pokemonNum;
    String pokemonGrayImageUrl;
    String pokemonColorImageUrl;

    @OneToMany(mappedBy = "pokemonPicture", cascade = CascadeType.ALL)
    List<UserPokemon> userPokemonList = new ArrayList<>();
}
