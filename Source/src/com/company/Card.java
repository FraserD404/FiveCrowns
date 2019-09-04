package com.company;

public class Card {

    String faceValue;
    int numValue;
    int beingUsed;

    public Card(String face, int numValue){
        this.faceValue = face;
        this.numValue = numValue;
        this.beingUsed = 0;
    }

    public void getInfo(){

        System.out.println("Card value of " + getNumValue() + " & face " + getFaceValue());
    }

    public String getFaceValue() {
        return faceValue;
    }

    public int getStatus(){
        return beingUsed;
        /*
        Return value 0 - currently in deck
        Return value 1 - in hand or in discard
         */
    }

    public int getNumValue() {
        return numValue;
    }
}
