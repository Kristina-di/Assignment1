/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Kristina Dias
 */
import java.util.Scanner;
public class CardTrick {
	
	public static void main(String[] args)
	{
		Card[] magicHand = new Card[7];
		
		Card luckyCard = new Card();
		luckyCard.setSuit("Hearts");
		luckyCard.setValue(12);
		
		for (int i=0; i<magicHand.length; i++)
		{
			Card c = new Card();
			//c.setValue(insert call to random number generator here)
			c.setValue((int)(Math.random() * 13 + 1));
			//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
			c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
			magicHand[i] = c;
		}
		
		//insert code to ask the user for Card value and suit, create their card
		
		int inputValue = 0;
		String inputSuit = "Any";
		/**Scanner sc = new Scanner(System.in);
		System.out.println("Choose the card value: ");
		inputValue = sc.nextInt();
		System.out.println("Choose the card suit: ");
		inputSuit = sc.next();*/
		// and search magicHand here
		boolean check = false;
		
		for (int j = 0; j < magicHand.length; j++){
			if((magicHand[j].getValue() == 7) && 
					(magicHand[j].getSuit().equalsIgnoreCase("Hearts")));
			check = true;
		}
		/**for (int j = 0; j < magicHand.length; j++){
			if((magicHand[j].getValue() == inputValue) && 
					(magicHand[j].getSuit().equalsIgnoreCase(inputSuit)));
			check = true;
		}*/
		//Then report the result here
		if(check = true){
			System.out.println("You win!");
		}else{
			System.out.println("You lose!");
		}
	}
}
