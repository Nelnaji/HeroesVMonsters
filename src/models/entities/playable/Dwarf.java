package models.entities.playable;
import models.entities.Entity;

public class Dwarf extends Entity {
    private String name;

    Dwarf(){};

    Dwarf(String name){
        this.name= name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

}
