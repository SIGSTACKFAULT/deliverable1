package war;

import java.util.List;
import java.util.Collections;

import cards.RegularCard;
import game.Game;

public class War<C extends RegularCard> extends Game<WarPlayer<C>> {

    public List<C> deck;

    public War(String name, List<C> deck, List<WarPlayer<C>> players){
        super(name);
        this.deck = deck;
        System.err.printf("players: %d\n", players.size());
    }

    /**
     * play the game and block until finished.
     */
    public void play(){
        System.err.printf("playing game '%s'...\n", name);
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

        // debug
        for(WarPlayer<C> p : players){
            System.err.printf("%s:", p.getName());
            for(C c : p.cards){
                System.err.printf("%c%d,",c.getSuitChar(),c.getValue());
            }
            System.err.printf("\n");
            // test case: check that every card is accounted for
        }


    }

    public void declareWinner(){

    }
    
}
