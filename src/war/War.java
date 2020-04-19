package war;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

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

    private int roundNum = 0;
    private void playRound(){
        System.out.printf("--- playing round %d ---\n", ++roundNum);
        WarRoundState<C> state = new WarRoundState<C>(players);
        state.playCards();
        WarPlayer<C> winner = state.detectSingleWinner();

        declareWinner(1);
    }

    private WarPlayer<C> playRoundInternal(WarRoundState<C> state){
        state.playCards();
        state.elimateLosers();
        WarPlayer<C> winner = state.detectSingleWinner();
        if(winner == null){
            state.playCards(); state.playCards(); state.playCards();
            playRoundInternal(state);
        } else {
            return winner;
        }
    }


    public void declareWinner(int id){
        winner = id;
        WarPlayer<C> winner = players.get(id);
        System.out.printf("%s wins!\n\n", winner.getName());
    }
    
}
