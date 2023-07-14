package io.wferdinando.dslist.dto;

import io.wferdinando.dslist.entities.GameList;

public class GameListDTO {
    
    private Long id;
    private String name;
    
    public GameListDTO() {
    }

    public GameListDTO(GameList gameListEntity) {
       this.id = gameListEntity.getId();
       this.name = gameListEntity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
