package models.entities.playable;
import models.entities.Entity;
import models.entities.actions.Combat;
import utils.Dice;

public class Human extends Entity implements Combat {

    private int bonus = 1;
    private String name;

    //every playable character has to get a name either set during the constructor or creation
    public Human(String name){
        this.name = name;
    }



    //region GET/SET
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBonus() {
        return bonus;
    }

    private void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getEndu() {
        return super.getEndu() + getBonus();
    }

    @Override
    public int getStren() {
        return super.getStren() + getBonus();
    }

    //endregion


        public void attaquer(Entity entite){
        int damage = Dice.D4.roll() ;





    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + getName() + '\'' +
                "Endurance='" + getEndu() +  "' + Bonus='" + getBonus() + '\'' +
                "Force='" + getStren() + '\'' +
                "Vie='" + getHealth() + '\'' +
                '}';
    }

}
