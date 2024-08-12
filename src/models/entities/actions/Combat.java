package models.entities.actions;

import models.entities.Entity;
import utils.Dice;

import static utils.Utils.Modifier.modifier;

public interface Combat {

    public int getStren();

    public default void attaquer(Entity entity){
            // setup des degats
            int degats = Dice.D4.roll() + modifier(this.getStren());
            //reduit les degats d'une entité
            entity.setHealth(-degats);
    }


//    public void defendre();

}
