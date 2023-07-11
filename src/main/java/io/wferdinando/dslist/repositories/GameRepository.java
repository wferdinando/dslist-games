package io.wferdinando.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.wferdinando.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
