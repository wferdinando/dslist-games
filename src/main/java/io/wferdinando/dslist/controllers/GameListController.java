package io.wferdinando.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.wferdinando.dslist.dto.GameListDTO;
import io.wferdinando.dslist.services.GameListService;

@RestController
@RequestMapping( value = "/lists")
public class GameListController {
    
    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping("/{id}")
    public GameListDTO findById(@PathVariable(value = "id") Long id){
        GameListDTO result = gameListService.findById(id);
        return result;
    }

}
