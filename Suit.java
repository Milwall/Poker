/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keith_milton_sb13516_ap;

/**
 *
 * @author Keith Milton
 */
public enum Suit
{

    //card suits with defined colours
    CLUBS("Black"),
    SPADES("Black"),
    HEARTS("Red"),
    DIAMONDS("Red");
    
    
    private final String colour;   
    
    //method suit
    Suit(String colour)
    {
        //assigns colour of suit to colour 
        this.colour = colour;
    }
    
    //method get colour gets colour of the suit
    public String getColour()
    {
        //returns colour of the suit
        return colour;
    }
}
