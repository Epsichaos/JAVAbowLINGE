package com.xp.bowling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by epsichaos on 12/02/2016.
 */
public class UserInterface {

    // display the playing frame interface
    public Frame playFrameInterface(Player player, int frameNumber) {
        int firstLaunchScore;
        int secondLaunchScore;
        int thirdLaunchScore;
        int userFrameNumber = frameNumber + 1;
        Frame fr;

        // initialisation
        firstLaunchScore = 0;
        secondLaunchScore = 0;
        thirdLaunchScore = 0;

        Scanner sc = new Scanner(System.in);

        if(userFrameNumber != 10) {
            System.out.println(" > Le joueur " + player.getPlayerName() + " joue la Frame " + userFrameNumber);
            System.out.println("-------------------------------------------");

            System.out.println(" > Rentrez votre score pour le premier lancer ...");
            firstLaunchScore = sc.nextInt();

            System.out.println("\n");
            if(firstLaunchScore != 10) {
                System.out.println(" > Rentrez votre score pour le second lancer ...");
                secondLaunchScore = sc.nextInt();
            }

            fr = new Frame(firstLaunchScore, secondLaunchScore);
            return fr;
        }
        // this is the last frame
        else {
            System.out.println(" > Le joueur " + player.getPlayerName() + " joue la Frame " + userFrameNumber);
            System.out.println("-------------------------------------------");

            System.out.println(" > Rentrez votre score pour le premier lancer ...");
            firstLaunchScore = sc.nextInt();

            System.out.println(" > Rentrez votre score pour le second lancer ...");
            secondLaunchScore = sc.nextInt();

            fr = new Frame(firstLaunchScore, secondLaunchScore);
            if(fr.isStrike()||fr.isSpare()) {
                System.out.println(" > Rentrez votre score pour le troisième lancer ...");
                thirdLaunchScore = sc.nextInt();
                fr.setThirdLaunch(thirdLaunchScore);
                return fr;
            }
            else {
                return fr;
            }
        }
    }
    /*
    * Display menu interface which allow player creation
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
                    end_while = true;
                    // default cases
                    break;
                default:
                    System.out.println(" > Erreur de saisie ...");
                    break;
            }
        }
        int i = 0;
        for(Player p : PList) {
            p.setPlayerNumber(i);
            i++;
        }
        return PList;
    }

    // display scoreBoard
    public void scoreBoard(List<Player> playerList) {
        int playerNumber = 0;
        System.out.println("\n");
        System.out.println(">>> Fin de la partie <<<");
        System.out.println("-------------------------");
        for(Player p : playerList) {
            playerNumber = p.getPlayerNumber()+1;
            System.out.println(" - Joueur " + playerNumber + " : " + p.getPlayerName() + " -> " + p.getFinalScore() + " points...");
        }
    }
}
