package com.urmine.db.repository;

import com.urmine.db.entity.PokemonType;
import com.urmine.db.entity.PokemonTypeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonTypeRepository extends JpaRepository<PokemonType, PokemonTypeId> {

}
