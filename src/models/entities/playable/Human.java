package models.entities.playable;
import models.entities.Entity;
import models.entities.actions.Combat;


public class Human extends Entity implements Combat {

    private String name;




    Human(){};
    //every playable character has to get a name either set during the constructor or creation
    Human(String name){
        this.name = name;
    }


    //region  SET/GET
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion


    @Override
    public void attaquer(Entity entity) {



    }
}
