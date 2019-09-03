package com.company;

public class Card {

    String faceValue;
    int numValue;

    public Card(String face, int numValue){
        this.faceValue = face;
        this.numValue = numValue;
    }

    public void getInfo(){

        System.out.println("Card value of " + getNumValue() + " & face " + getFaceValue());
    }

    public String getFaceValue() {
        return faceValue;
    }

    public int getNumValue() {
        return numValue;
    }
}
