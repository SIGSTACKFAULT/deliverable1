package war;

import java.util.LinkedList;
import java.util.List;

import cards.RegularCard;
import game.Game;

public class War<C extends RegularCard> extends Game<WarPlayer> {

    public War(String name){
        super(name);
    }

    public void play(){
        initGame();

    }

    /**
     * shuffle deck, deal, etc.
     */
    private void initGame(){
        List<C> deck = new LinkedList<C>();
        

    }

    public void declareWinner(){

    }
    
}
