package war;

/**
 *
 * @author knrta
 */
public abstract class Player 
{
    private String name; //the unique ID for this player
    
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String name)
    {
        name= name;
    }
    
    /**
     * @return the name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     */
    public abstract void play();
    
}
