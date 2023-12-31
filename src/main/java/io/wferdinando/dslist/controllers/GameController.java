package io.wferdinando.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.wferdinando.dslist.dto.GameDTO;
import io.wferdinando.dslist.dto.GameMinDTO;
import io.wferdinando.dslist.services.GameService;

@RestController
@RequestMapping( value = "/games")
public class GameController {
    
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

    @GetMapping("/{id}")
    public GameDTO findById(@PathVariable(value = "id") Long id){
        GameDTO result = gameService.findById(id);
        return result;
    }

}
