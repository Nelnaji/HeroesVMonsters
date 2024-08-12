package models.entities;

import models.entities.actions.Combat;
import models.entities.inventory.Item;
import utils.Dice;
import static utils.Utils.Modifier.modifier;

import java.util.ArrayList;
import java.util.function.Consumer;

abstract public class Entity implements Combat {

    private Consumer<Entity> dieEvent;
    private int endu =  Dice.D6.roll(4, 3);
    private int stren =  Dice.D6.roll(4, 3);
    private int maxHealth =  3 + Dice.D6.roll(4,3)  + modifier(getEndu());
    private int currentHealth = maxHealth;
    private ArrayList<Item> inventory;


//region GET/SET
    public int getEndu() {
        return endu;
    }

    public void setEndu(int endu) {
        endu = endu;
    }

    public int getStren() {
        return stren;
    }

    public void setStren(int stren) {
        this.stren = stren;
    }

    private void setMaxHealth(int maxHealth){this.maxHealth = maxHealth;}
    public int getMaxHealth(){ return maxHealth;}

    public int getHealth() {
        return currentHealth;
    }


    public void setHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

/*    public boolean isAlive(){
        return currentHealth > 0;
    }*/


    //endregion

}
