package io.wferdinando.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.wferdinando.dslist.dto.GameListDTO;
import io.wferdinando.dslist.entities.GameList;
import io.wferdinando.dslist.repositories.GameListRepository;

@Service
public class GameListService {
    
    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
      List<GameList> result =  gameListRepository.findAll();
      return  result.stream().map(g -> new GameListDTO(g)).toList();
    }

    @Transactional(readOnly = true)
    public GameListDTO findById(Long id){
       GameList result = gameListRepository.findById(id).get();
       return new GameListDTO(result);
      }
}
