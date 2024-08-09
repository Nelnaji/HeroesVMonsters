package models.entities.playable;

import models.entities.Entity;

public class Dwarf extends Entity {
    private String name;

    //For creation by input
    public Dwarf(){};
    public Dwarf(String name) {
        this.name = name;
    }

    //region GET/SET
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //endregion
}
