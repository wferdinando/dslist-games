package io.wferdinando.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "listGame_id")
    private GameList listGame;
    
    public BelongingPK() {
    }

    public BelongingPK(Game game, GameList listGame) {
        this.game = game;
        this.listGame = listGame;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getListGame() {
        return listGame;
    }

    public void setListGame(GameList listGame) {
        this.listGame = listGame;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((game == null) ? 0 : game.hashCode());
        result = prime * result + ((listGame == null) ? 0 : listGame.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BelongingPK other = (BelongingPK) obj;
        if (game == null) {
            if (other.game != null)
                return false;
        } else if (!game.equals(other.game))
            return false;
        if (listGame == null) {
            if (other.listGame != null)
                return false;
        } else if (!listGame.equals(other.listGame))
            return false;
        return true;
    }

    
    
}
