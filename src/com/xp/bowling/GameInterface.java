package com.xp.bowling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by epsichaos on 12/02/2016.
 */
public class GameInterface {
    /*
    * Menu Interface which allow player creation
    * Return the player list
     */
    public List<Player> beginMenuInterface() {
        int options;
        String opt;
        String temp_name;
        String p_name;
        Boolean res;
        res = false;
        List<Player> PList;
        PList = new ArrayList<Player>();

        boolean end_while;
        end_while = false;

        System.out.println(">--------------------------------------<");
        System.out.println(" |    Bienvenue dans JAVABowLINGE      |");
        System.out.println(">--------------------------------------<\n");
        System.out.println("Joueur 1, entrez votre nom...\n");

        Scanner sc = new Scanner(System.in);
        p_name = sc.nextLine();
        PList.add(new Player(p_name));

        System.out.println(PList.get(0).getPlayerName() + "\n");

        while(!end_while) {
            // print options
            System.out.println(">>> SELECTION MENU <<<");
            System.out.println("---------------------------");
            System.out.println("1 : Ajouter un joueur");
            System.out.println("2 : Commencer la partie");
            System.out.println("0 : Quitter le menu et abandonner");
            System.out.println("---------------------------");

            opt = sc.nextLine();
            options = Integer.parseInt(opt);

            switch (options) {
                // On sort
                case 0:
                    System.out.println(" > Abandon de la partie ...");
                    res = false;
                    end_while = true;
                    break;
                // On créé un nouveau joueur
                case 1:
                    System.out.println(" > Création d'un nouveau joueur ...");
                    // création joueur
                    temp_name = sc.nextLine();
                    PList.add(new Player(temp_name));
                    System.out.println(" > Joueur " + temp_name + " créé ...");
                    break;
                // commencer la partie
                case 2:
                    System.out.println(" > Lancement de la partie ...\n");
                    res = true;
                    end_while = true;
                    // default cases
                    break;
                default:
                    System.out.println(" > Erreur de saisie ...");
                    break;
            }
        }
        // return player list
        return PList;
    }
}
