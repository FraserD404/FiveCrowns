package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    private static Card[] deck;
    private static ArrayList<Card> playerHand = new ArrayList<>();

    public Game(){
        deck = Main.getDeck();
    }

    public void play(int target){

        clearHand();

        System.out.println("\n");

        System.out.println("Welcome to Five Crowns!");
        System.out.println("Dealing your deck.");
        System.out.println("Target Cards" + " " + target);

        boolean allGenerated = false;

        while(!allGenerated) {
            int random = (int) (Math.random() * 115 + 0); //Get a random card from array
            if (deck[random].getStatus() == 0) { //card is in deck
                playerHand.add(deck[random]);
                deck[random].beingUsed = 1;
            }

            if (playerHand.size() == target) {
                allGenerated = true;
            }

        }

        scanForWild(target);

        System.out.println("Printing your deck out...");

        for (Card c : playerHand) {
            c.getInfo();
        }

    }

    private void scanForWild(int wild){
        for (Card card : playerHand) {
            if (card.getNumValue() == wild) {
                System.out.println("Card at index " + playerHand.indexOf(card) + " is wild!");
            }
        }
    }

    private void clearHand(){
        for (int i = 0; i < playerHand.size(); i++) {
            playerHand.remove(i);
        }
    }



}
