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
            magicHand[i]=c;
           
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        
        System.out.println(magicHand[i].getSuit());
         System.out.println(magicHand[i].getValue());
        }
         //insert code to ask the user for Card value and suit, create their card
        Scanner in=new Scanner(System.in);
        System.out.println("enter value");
        int uservalue=in.nextInt();
        in.nextLine();
        System.out.println("enter Suit");
        String usersuit=in.nextLine();
       
        boolean found=false;
        // and search magicHand here
       for(int i=0;i<magicHand.length;i++)
        {
        if (uservalue==magicHand[i].getValue() && usersuit.equalsIgnoreCase(magicHand[i].getSuit()))
        {
            found=true;
            break;
        }
        }
       //Then report the result here
       if (found==true)
        {
            System.out.println("Your matching card found");
        }
        else
        {
           System.out.println("Your matching card not found"); 
        }
       
       
        
    
    
    }
   
}
