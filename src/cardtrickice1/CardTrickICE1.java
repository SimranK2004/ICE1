/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Simran Kaur Saini, 991663582
package cardtrickice1;
import content.Card;
import java.util.ArrayList;

import java.util.Scanner;
/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 * modifier - Simran kaur saini, 991663582
 */
public class CardTrickICE1 {
    public static void main(String[] args) {
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuits("diamonds");
        
        Card[] magicHand = new Card[7]; //Array of object
        ArrayList<String> t_suite = new ArrayList<String>();
        ArrayList<Integer> t_Value = new ArrayList<Integer>();
        
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue((int)(Math.ceil((Math.random()*13))));//use a method to generate random *13
            
            c1.setSuits(Card.SUITS[((int)(Math.floor(Math.random()*4)))]);//random method suit 
            t_suite.add(c1.getSuits());
            t_Value.add(c1.getValue());
        
        
        //displaying cards
        magicHand[i] = c1;
        System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuits());
        }
        //step 2:take input 
        Scanner sc = new Scanner(System.in);
        System.out.println("Please chose the suit:\n" 
                +"1.Hearts\n"
                +"2.Diamonds\n"
                +"3.Spades\n"
                +"4.Clubs");
        int suite_number = sc.nextInt();
        String suite = "";
        switch(suite_number){
            case 1:
                suite = "Hearts";
                break;
            case 2 :
                suite = "Diamonds";
                break;
            case 3:
                suite = "Spades";
                break;
            case 4:
                suite = "Clubs";
                break;
        }
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Please choose the value(1 to 12): ");
        int suite_value = sc1.nextInt();
        System.out.println("Your card: " + suite_value + " " + suite);
        
        //match with array
        boolean isMatch = false;
        for(int i =0; i < magicHand.length; i++){
            if(magicHand[i].getSuits().equalsIgnoreCase(suite)){
                if(magicHand[i].getValue() == suite_value){
                    isMatch = true;
                    break;
                }
            }
        }
        if(isMatch)
            System.out.println("Card Matched!!\nYou won!!");
        else
            System.out.println("Sorry, no match.");
        
    }
    }
