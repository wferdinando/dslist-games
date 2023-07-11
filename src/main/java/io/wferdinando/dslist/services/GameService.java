package io.wferdinando.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.wferdinando.dslist.dto.GameMinDTO;
import io.wferdinando.dslist.entities.Game;
import io.wferdinando.dslist.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
      List<Game> result =  gameRepository.findAll();
      return  result.stream().map(g -> new GameMinDTO(g)).toList();
    }
}
