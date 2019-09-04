package com.company;

public class Main {

    private static Card[] deck = new Card[116];

    public static void main(String[] args) {
        genCards(); //Generates card deck
        Game game = new Game();
        game.play(3);
        game.play(7);
        game.play(13);

    }

    public static Card[] getDeck(){
        return deck;
    }
    private static void genCards(){
        String[] faces = {"Star", "Heart", "Spade", "Clubs", "Diamond"};
        int deckIndex = 0;


        /*
        Generates deck without jokers
         */
        for (int count = 1; count < 3; count++) {
            for (int f = 0; f < 5; f++) {
                for (int i = 3; i < 14; i++) {
                    deck[deckIndex] = new Card(faces[f], i);
                    deckIndex += 1;
                }
            }

        }

        /*
        Adds jokers to the deck at the end
         */

        for (int dex = 110; dex < 116; dex++){
            deck[dex] = new Card("Joker", 50);
        }

        print("Complete!");
    }

    private static void print(String word){

        System.out.println(word);
    }

    private static void print(int num){

        System.out.println(num);
    }
}
