package com.urmine.db.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@IdClass(PokemonEvolutionId.class)
public class PokemonEvolution {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pokemonId")
    Pokemon pokemon;
    @Id
    String firstMethod;
    Long firstEvolutionId;
    String secondMethod;
    Long secondEvolutionId;
}
