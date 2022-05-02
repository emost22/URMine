package com.urmine.db.repository;

import com.urmine.db.entity.PokemonPicture;
import com.urmine.db.entity.PokemonPictureId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonPictureRepository extends JpaRepository<PokemonPicture, PokemonPictureId> {

}
