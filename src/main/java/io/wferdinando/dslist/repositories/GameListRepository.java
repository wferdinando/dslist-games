package io.wferdinando.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.wferdinando.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
