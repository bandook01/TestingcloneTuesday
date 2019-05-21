/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;

/****
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to enter a card(value and suit) and searches the array of cards
 * for the match to the user's card.
 * To be used as starting code for ICE 1
 * @author Sivagami
 */
public class Card {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
        CardBase[] magicHand = new CardBase[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            CardBase c = new CardBase();
            c.setValue(c.randomvalue());
            c.setSuit(c.SUITS[c.randomsuit()]);
            
        // and search magicHand here
       
        }
       
       
        
    
    
    }
   
}
