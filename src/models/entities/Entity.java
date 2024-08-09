package models.entities;

import utils.Dice;


abstract public class Entity {

    private int endu = Dice.D6.roll(4, 3);
    private int stren = Dice.D6.roll(4,3);
    // la vie de base est de 5 + (3 dés sur 4) + dependament de l'endurance malus ou bonus de vie
    private int health = 5 + Dice.D6.roll(4,3)  + getMalusBonus();

//region GET/SET
    public int getEndu() {
        return endu;
    }

    private  void setEndu(){
        this.endu = Dice.D6.roll(4, 3);
    }

    private void setEndu(int endu) {
        this.endu = endu;
    }

    public int getStren() {
        return stren;
    }

    private void setStren(){
        this.stren = Dice.D6.roll(4,3);
    }
    private void setStren(int stren) {
        this.stren = stren;
    }

    public int getHealth() {
        return health;
    }


    private void setHealth(int health) {
        this.health = health;
    }



    @Override
    public String toString() {
        return "Entité lambda{" +
                "Endurance de mon entité='" + getEndu() + '\'' +
                "Force='" + getStren() + '\'' +
                "Vie='" + getHealth() + '\'' +
                '}';
    }
    //endregion




}
