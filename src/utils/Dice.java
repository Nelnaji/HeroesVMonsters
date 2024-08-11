package utils;

import java.util.*;

public enum Dice {
    D6(6),
    D4(4);

    private int nbFaces;

    //Constructor
    private Dice(int value) {
        this.nbFaces = value;
    }

    public int getNbFaces() {
        return nbFaces;
    }

    public int roll() {
        Random rand = new Random();
        return rand.nextInt(getNbFaces()) + 1;
    }

    public int roll(int nbLance, int nbToKeep) {
        List<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < nbLance; i++) {
            rolls.add(roll());
        }

        rolls.sort(Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < nbToKeep; i++) {
            sum += rolls.get(i);
        }

        return sum;
    }

    public int myfunc(Dice dice) {
        return dice.nbFaces;
    }

}
