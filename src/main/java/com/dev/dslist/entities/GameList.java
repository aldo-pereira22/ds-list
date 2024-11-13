package com.dev.dslist.entities;

import java.util.Objects;

public class GameList {
    private long id;
    private String name;

    GameList(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameList gameList)) return false;
        return id == gameList.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
