package com.urmine.db.repository;

import com.urmine.db.entity.PokemonEvolution;
import com.urmine.db.entity.PokemonEvolutionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonEvolutionRepository extends JpaRepository<PokemonEvolution, PokemonEvolutionId> {

}
