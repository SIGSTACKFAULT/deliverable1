package game;

import java.util.ArrayList;
import java.util.List;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 */
public abstract class Game<P extends Player<?>> {
    final public String name; //the title of the game
    protected List<P> players; // the players of the game
    
    public Game(String name) {
        this.name = name;
        players = new ArrayList<P>();
    }

     /**
     * @return the players of this game
     */
    public List<P> getPlayers() {
        return players;
    }

    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public abstract void play();
    
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();


}
