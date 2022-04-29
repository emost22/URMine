package com.urmine.db.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PokemonEvolutionId implements Serializable {
    Long pokemon;
    String firstMethod;
}
