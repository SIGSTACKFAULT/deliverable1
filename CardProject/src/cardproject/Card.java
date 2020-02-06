/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardproject;

/**
 *
 * @author knrta
 */
public abstract class Card 
{
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    @Override
    public abstract String toString();
    
}

