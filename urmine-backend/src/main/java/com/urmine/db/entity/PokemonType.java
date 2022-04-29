package com.urmine.db.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@IdClass(PokemonTypeId.class)
public class PokemonType {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pokemonId")
    Pokemon pokemon;

    @Id
    Integer typeNumber;
    String pokemonType;
}
