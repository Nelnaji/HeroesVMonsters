import models.entities.playable.Dwarf;

import java.util.Scanner;

public class Game {

    public void start() {

        UI consoleUI = new UI();

        //commencer introduction du jeu
        consoleUI.gameIntro();

        Scanner scan = new Scanner(System.in);


        // optimisation du code pour qu'il  ne soit que
        char classChoice = scan.next().charAt(0);


        if (classChoice != 'h' || classChoice != 'n') {

            System.out.println("Veuillez taper (h) ou (n) pour choisir entre (H)umain et (N)ain: ");

        } else if (classChoice == 'n') {

            System.out.println("Vous avez choisi le Nain");
            System.out.println("Veuillez taper le nom de votre personnage");

            boolean isNameGiven = scan.hasNext();
            if (isNameGiven) {
                String name = scan.next();

                System.out.printf("Bienvenue %s ! vous avez été capturé par l'empire Rotan et avez été forcé au combat à mort dans l'arène de l'empire", name);
                System.out.println("Vous avez trois ennemies à combattre, si vous en sortez vainqueur vous serrez liberé et serrez nommé citoyen de l'empire au titre de : 'Gladiatus Victorius' ");

                Dwarf playableCharacter = new Dwarf(name);
                System.out.printf("Voici vos stats %s %s ", playableCharacter.getName(), playableCharacter);
            }

        } else if (classChoice == 'h') {

            System.out.println("Vous avez choisi l'Humain");
            System.out.println("Veuillez taper le nom de votre personnage");

            boolean isNameGiven = scan.hasNext();
            if (isNameGiven) {
                String name = scan.next();

                System.out.printf("Bienvenue %s ! vous avez été capturé par l'empire Rotan et avez été forcé au combat à mort dans l'arène de l'empire", name);
                System.out.println("Vous avez trois ennemies à combattre, si vous en sortez vainqueur vous serrez liberé et serrez nommé citoyen de l'empire au titre de : 'Gladiatus Victorius' ");

                Dwarf playableCharacter = new Dwarf(name);
                System.out.printf("Voici vos stats %s %s ", playableCharacter.getName(), playableCharacter);
            }
        }


    }

}
