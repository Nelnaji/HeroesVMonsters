package models.entities;

abstract public class Entity {

    private int endu;
    private int stren;
    private int health;

    public Entity(int endu, int stren, int health) {
        this.endu = endu;
        this.stren = stren;
        this.health = health;
    }

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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    //endregion

}
