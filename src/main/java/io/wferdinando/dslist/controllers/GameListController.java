package io.wferdinando.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.wferdinando.dslist.dto.GameListDTO;
import io.wferdinando.dslist.dto.GameMinDTO;
import io.wferdinando.dslist.services.GameListService;
import io.wferdinando.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findBylist(@PathVariable(value = "listId") Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }
}
