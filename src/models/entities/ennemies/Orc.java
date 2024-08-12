package models.entities.ennemies;

import models.entities.Entity;
import models.entities.actions.Combat;
import utils.Dice;

import java.util.Random;

import static utils.Utils.Modifier.modifier;


public class Orc extends Entity implements Combat {

    private int gold = Dice.D6.roll();
    private int bonus = 1;

    //region GET/SET
    public int getGold() {
        return gold;
    }

    //private setGold to protect it
    private void setGold(int gold) {
        this.gold = gold;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    //endregion


    @Override
    public void attaquer(Entity entity) {
        int degats = Dice.D4.roll() + modifier(getStren());

        //reduit les degats d'une entité
        entity.setHealth(-degats);
        System.out.printf("Vous avez retiré %f points de vie à %s ", degats, entity.getClass().getName());
    }
}
