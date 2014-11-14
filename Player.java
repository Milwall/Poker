/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keith_milton_sb13516_ap;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Keith Milton
 */
public class Player
{
    //player method
    public Player()
    {
        //instatiate hand
        Hand hand = new Hand();
        //show hand
        hand.show();
    }

    class Hand
    {
        //decare arraylist
        List<Card> cards;

        public Hand()
        {
            //instantiate cards
            cards = new ArrayList<>();
            //call makehand method
            makeHand();
        }
        //makehand method
        public void makeHand()
        {
            int i = 0;
            while (i < 5)
            {

                Card card = new Card();

                //while card is a duplicate make a new card
                while (duplicateCard(card))
                {
                    card = new Card();
                }
                //add the card to the arraylist and increment i
                cards.add(card);
                i++;
            }

        }
        //show method
        public void show()
        {
            //for each loop through cards
            for (Card card : cards)
            {
                //print cards
                System.out.println(card);
            }

        }
        //duplicatecard method
        private boolean duplicateCard(Card c)
        {

            //for each loop through list
            for (Card card : cards)
            {
                //if card is same as list returns true else returns false
                if (card.getSuit().equals(c.getSuit()) && card.getValue().equals(c.getValue()))
                {
                    return true;
                }
            }

            return false;
        }

    }

}
