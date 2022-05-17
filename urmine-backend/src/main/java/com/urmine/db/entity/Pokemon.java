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
public class Pokemon {
    @Id
    Long pokemonId;
    String pokemonName;
    String kind;
    String color;
    String description;

    @OneToMany(mappedBy = "pokemon", cascade = CascadeType.ALL)
    List<PokemonType> pokemonTypeList = new ArrayList<>();

    @OneToMany(mappedBy = "pokemon", cascade = CascadeType.ALL)
    List<PokemonPicture> pokemonPictureList = new ArrayList<>();

    @OneToMany(mappedBy = "pokemon", cascade = CascadeType.ALL)
    List<PokemonEvolution> pokemonEvolutionList = new ArrayList<>();
}
