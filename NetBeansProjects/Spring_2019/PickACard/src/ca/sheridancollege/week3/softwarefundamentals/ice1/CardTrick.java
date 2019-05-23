/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagami
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
  
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setSuit(Card.SUITS[c.getRandomSuit()]);
            c.setValue(c.getRandomValue());
        }
        String suit;
        int choice;
         Scanner input = new Scanner(System.in);
         System.out.println("enter suit");
         suit = input.nextLine();
         System.out.println("enter value");
         choice= input.nextInt();
    
    boolean found = false;
for(int i=0;i<magicHand.length;i++)
{
if(choice==magicHand[i].getValue() && suit.equalsIgnoreCase(magicHand[i].getSuit()))
{
    found =true;
    break;
}  
}
    
    if(found)
{
    System.out.println("  matching card found");
}
   else
{
    System.out.println("  matching card not found");
}
    }
}


    

