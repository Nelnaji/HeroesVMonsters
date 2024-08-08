package models.entities.playable;
import models.entities.Entity;

public class Human extends Entity {

    private String name;

    Human(){};
    //every playable character has to get a name either set during the constructor or creation
    Human(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
