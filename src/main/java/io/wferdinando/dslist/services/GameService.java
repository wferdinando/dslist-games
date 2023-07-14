package io.wferdinando.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.wferdinando.dslist.dto.GameDTO;
import io.wferdinando.dslist.dto.GameMinDTO;
import io.wferdinando.dslist.entities.Game;
import io.wferdinando.dslist.projections.GameMinProjection;
import io.wferdinando.dslist.repositories.GameRepository;

@Service
public class GameService {

  @Autowired
  GameRepository gameRepository;

  @Transactional(readOnly = true)
  public List<GameMinDTO> findAll() {
    List<Game> result = gameRepository.findAll();
    return result.stream().map(g -> new GameMinDTO(g)).toList();
  }

  @Transactional(readOnly = true)
  public GameDTO findById(Long id) {
    Game result = gameRepository.findById(id).get();
    return new GameDTO(result);
  }

  @Transactional(readOnly = true)
  public List<GameMinDTO> findByList(Long listId) {
    List<GameMinProjection> result = gameRepository.searchByList(listId);
    return result.stream().map(g -> new GameMinDTO(g)).toList();
  }

}
