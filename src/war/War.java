package war;

import java.util.List;
import java.util.Collections;

import cards.RegularCard;
import game.Game;

public class War<C extends RegularCard> extends Game<WarPlayer<C>> {

    public List<C> deck;

    public War(String name, List<C> deck, int bots){
        super(name);
        this.deck = deck;
        for(int i=0;i<bots+1;i++){
            this.players.add(new WarPlayer<C>());
        }
        System.err.printf("players: %d (%d bots 1 human)\n", players.size(), players.size()-1);
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

        // debug
        for(WarPlayer<C> p : players){
            System.err.printf("%s:", p.getName());
            for(C c : p.cards){
                System.err.printf("%c%d,",c.getSuitChar(),c.getValue());
            }
            // test case: check that every card is accounted for
        }


    }

    public void declareWinner(){

    }
    
}
