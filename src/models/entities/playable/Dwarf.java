package models.entities.playable;

import models.entities.Entity;

import models.entities.actions.Interactions;
import utils.Dice;

import static utils.Utils.Modifier.modifier;

public class Dwarf extends Entity implements Interactions {
    private String name;
    private int bonus = 2;

    //region Constructor

    public Dwarf(String name) {
        this.name = name;
    }

    //endregion
    //region GET/SET
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
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

    @Override
    public void depecer() {
        Interactions.super.depecer();
    }

}
