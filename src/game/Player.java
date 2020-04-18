package game;

import java.util.UUID;

/**
 *
 * @author knrta
 */
public abstract class Player<G extends Game<?>> {
    private String name; //the unique ID for this player
    
    public Player(){
        this(UUID.randomUUID().toString());
    }

    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}
