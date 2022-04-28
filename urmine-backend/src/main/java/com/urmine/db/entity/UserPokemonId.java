package com.urmine.db.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPokemonId implements Serializable {
    User user;
    PokemonPicture pokemonPicture;
}
