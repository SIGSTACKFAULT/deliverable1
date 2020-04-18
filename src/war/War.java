package war;

import java.util.List;
import java.util.Collections;

import cards.RegularCard;
import game.Game;

public class War<C extends RegularCard> extends Game<WarPlayer<C>> {

    public List<C> deck;
    private int winner = -1;

    public War(String name, List<C> deck, List<WarPlayer<C>> players){
        super(name);
        this.deck = deck;
        this.players = players;
        System.err.printf("players: %d\n", players.size());
    }

    /**
     * play the game and block until finished.
     */
    public void play(){
        System.out.printf("> playing game '%s', %d players...\n", name, players.size());
        initGame();

        while(winner < 0){
            playRound();
        }
    }

    /**
     * shuffle deck, deal, etc.
     */
    private void initGame(){
        Collections.shuffle(deck);
        // deal cards
        int i=0;
        for(C c : deck){
            System.err.printf("> giving %s to player index %d\n", c, i++ % players.size());
            System.err.flush();
            WarPlayer<C> p = players.get(i % players.size());
            p.giveCard(c);
        }
    }

    private void playRound(){
        System.err.printf("> playing round...\n");

        declareWinner(1);
    }

    public void declareWinner(int id){
        winner = id;
        WarPlayer<C> winner = players.get(id);
        System.out.printf("%s wins!\n\n", winner.getName());
    }
    
}
