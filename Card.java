/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keith_milton_sb13516_ap;

import java.util.Random;

/**
 *
 * @author Keith Milton
 */
public class Card
{
    //declare string, suit and int
    private String value;
    private Suit suit;
    private int i;

    private final Random random = new Random();

    //card method assigns a random number for both suit and value
    public Card()
    {
        //assignment a random number to i
        i = random.nextInt(4);
        //sets suit to random number i
        setSuit(i);

        //assignment a random number to i
        i = random.nextInt(13);
        //sets value to random number i
        setValue(i);

    }

    //setSuit method sets suit using switch case
    private void setSuit(int i)
    {

        switch (i)
        {

            case 0:
                suit = Suit.CLUBS;
                break;
            case 1:
                suit = Suit.SPADES;
                break;

            case 2:
                suit = Suit.HEARTS;
                break;

            case 3:
                suit = Suit.DIAMONDS;
                break;

        }

    }

    //setValue method sets value using switch case
    private void setValue(int i)
    {

        switch (i)
        {

            case 0:
                value = "Ace";
                break;

            case 1:
                value = "Two";
                break;

            case 2:
                value = "Three";
                break;

            case 3:
                value = "Four";
                break;

            case 4:
                value = "Five";
                break;

            case 5:
                value = "Six";
                break;

            case 6:
                value = "Seven";
                break;

            case 7:
                value = "Eight";
                break;

            case 8:
                value = "Nine";
                break;

            case 9:
                value = "Ten";
                break;

            case 10:
                value = "Jack";
                break;

            case 11:
                value = "Queen";
                break;

            case 12:
                value = "King";
                break;
        }

    }
    
    //method getsuit returns a suit
    public Suit getSuit()
    {
        return suit;
    }

    //method getsuit returns a value
    public String getValue()
    {
        return value;
    }

    //method tostring returns a value, suit and colour as a string
    @Override
    public String toString()
    {
        return value + " of " + suit + ", " + suit.getColour();
    }

}
