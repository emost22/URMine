package com.urmine.db.repository;

import com.urmine.db.entity.PokemonEvolution;
import com.urmine.db.entity.PokemonEvolutionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokemonEvolutionRepository extends JpaRepository<PokemonEvolution, PokemonEvolutionId> {
    /*
     * 진화 정보가 있는 포켓몬에 한해 진화 정보를 가져오는 메소드
     */
    List<PokemonEvolution> findPokemonEvolutionByPokemon_PokemonIdOrFirstEvolutionIdOrSecondEvolutionId(Long pokemonId, Long firstEvolutionId, Long secondEvolutionId);
}
