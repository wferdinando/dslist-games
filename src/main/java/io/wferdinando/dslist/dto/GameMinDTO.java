package io.wferdinando.dslist.dto;

import io.wferdinando.dslist.entities.Game;
import io.wferdinando.dslist.projections.GameMinProjection;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game gameEntity) {
        this.id = gameEntity.getId();
        this.title = gameEntity.getTitle();
        this.year = gameEntity.getYear();
        this.imgUrl = gameEntity.getImgUrl();
        this.shortDescription = gameEntity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection gameProjection) {
        this.id = gameProjection.getId();
        this.title = gameProjection.getTitle();
        this.year = gameProjection.getGameYear();
        this.imgUrl = gameProjection.getImgUrl();
        this.shortDescription = gameProjection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
