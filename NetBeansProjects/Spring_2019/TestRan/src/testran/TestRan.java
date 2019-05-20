/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testran;

/**
 *
 * @author kumarayyaduraigunaseelan
 */
public class TestRan
{

 private String suit;
 public static final String SUITS[] = {"Diamonds","Spades","Clubs","Hearts1345"};
// public static final String SUITS[] = {"Diamonds67","Spades","Clubs","Hearts"};
 private int value;

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
//add two methods to generate random suit and values

public int getRandomValue()
{
    int number= (int) (Math.random()*13+1);
    return number;
}
public int getRandomSuit()
{
    int number = (int) (Math.random()*3+0);
    return number;
}
        


}
