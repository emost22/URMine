package com.urmine.db.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PokemonPictureId implements Serializable {
    Long pokemon;
    Integer pokemonNum;
}
