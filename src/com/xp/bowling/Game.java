package com.xp.bowling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Integer;

import com.xp.bowling.Player;

/**
 * Created by epsichaos on 06/02/2016.
 */
public class Game {

    // private variables
    List<Player> playerList = new ArrayList<Player>();

    // fonctions
    public Player getPlayer(int playerNumber) {
        return playerList.get(playerNumber);
    }

    /*
    * Say if a score is valid or not
    * ------------------------------
    * A score is valid if it's in the range 0-10
    *
    */
    public boolean isValid(int score) {
        if(score < 0 || score > 10) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean isValid(int score1, int score2) {
        int temp = score1 + score2;
        if(temp < 0 || temp > 10) {
            return false;
        }
        else {
            return true;
        }
    }

    public void setScoreFrame(Player player, int scoreFirstLaunch, int scoreSecondLaunch) {
        player.frameList.add(new Frame(scoreFirstLaunch, scoreSecondLaunch));
    }

    public void playFrame(Player player, int frameNumber) {
        int firstLaunchScore;
        int secondLaunchScore;

        // initialisation
        firstLaunchScore = 0;
        secondLaunchScore = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println(" > Le joueur " + player.getPlayerName() + " joue la Frame " + frameNumber);
        System.out.println("-------------------------------------------");

        // first launch input
        do {
            if(!isValid(firstLaunchScore)) {
                System.out.println(" > Votre premier lancer doit être entre 0 et 10 !");
            }
            System.out.println(" > Rentrez votre score pour le premier lancer ...");
            firstLaunchScore = sc.nextInt();
        } while(!isValid(firstLaunchScore));

        do {
            if(!isValid(secondLaunchScore)) {
                System.out.println(" > Votre second lancer doit être entre 0 et 10 !");
            }
            if(!isValid(firstLaunchScore, secondLaunchScore)) {
                System.out.println(" > La somme de vos deux lancers doit être entre 0 et 10 !");
            }
            System.out.println(" > Rentrez votre score pour le second lancer ...");
            secondLaunchScore = sc.nextInt();
        } while(!isValid(firstLaunchScore, secondLaunchScore) || !isValid(secondLaunchScore));

        player.setFrame(firstLaunchScore, secondLaunchScore);
    }


    public Boolean beginGame() {
        int options;
        String opt;
        String temp_name;
        String p_name;
        Boolean res;
        res = false;

        boolean end_while;
        end_while = false;

        System.out.println(">--------------------------------------<");
        System.out.println(" |    Bienvenue dans JAVABowLINGE      |");
        System.out.println(">--------------------------------------<\n");
        System.out.println("Joueur 1, entrez votre nom...\n");

        Scanner sc = new Scanner(System.in);
        p_name = sc.nextLine();
        playerList.add(new Player(p_name));
        System.out.println(playerList.get(0).getPlayerName() + "\n");

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
                    playerList.add(new Player(temp_name));
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
        System.out.println("Les joueurs suivant jouent : ");
        for (Player player : playerList) {
            System.out.println(" - " + player.getPlayerName());
        }
        System.out.println("\n");
        return res;
    }
}
