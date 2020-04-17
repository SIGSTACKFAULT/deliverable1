package war;

import java.util.List;
import java.util.Collections;

import cards.RegularCard;
import game.Game;

public class War<C extends RegularCard> extends Game<WarPlayer<C>> {

    public List<C> deck;

    public War(String name, List<C> deck){
        super(name);
        this.deck = deck;
    }

    /**
     * play the game and block until finished.
     */
    public void play(){
        initGame();
    }

    /**
     * shuffle deck, deal, etc.
     */
    private void initGame(){
        Collections.shuffle(deck);
        // deal cards
        int i=0;
        for(C c : deck){
            WarPlayer<C> p = players.get(i % players.size());
            p.giveCard(c);
        }
    }

    public void declareWinner(){

    }
    
}
