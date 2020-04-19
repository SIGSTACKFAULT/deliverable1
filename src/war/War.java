package war;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import cards.RegularCard;
import game.Game;

public class War<C extends RegularCard> extends Game<WarPlayer<C>> {

    public List<C> deck;
    private WarPlayer<C> winner = null;
    Scanner sc;

    public War(String name, List<C> deck, List<WarPlayer<C>> players) {
        super(name);
        this.deck = deck;
        this.players = players;
        System.err.printf("players: %d\n", players.size());
    }

    /**
     * play the game and block until finished.
     */
    public void play() {
        System.out.printf("> playing game '%s', %d players...\n", name, players.size());
        sc = new Scanner(System.in);
        initGame();

        while (winner == null) {
            playRound();
        }
    }

    /**
     * shuffle deck, deal, etc.
     */
    private void initGame() {
        Collections.shuffle(deck);
        // deal cards
        int i = 0;
        for (C c : deck) {
            System.err.printf("> giving %s to player index %d\n", c, i++ % players.size());
            System.err.flush();
            WarPlayer<C> p = players.get(i % players.size());
            p.giveCard(c);
        }
    }

    private int roundNum = 0;

    private void playRound() {
        System.out.printf("--- playing round %d ---\n", ++roundNum);
        System.err.println(this.players);
        WarRoundState<C> state = new WarRoundState<C>(players);

        WarPlayer<C> roundWinner = playRoundInternal(state);
        state.giveCardsTo(roundWinner);
        System.out.printf("%s wins the round!\n", roundWinner.getName());
        for(WarPlayer<C> p : new LinkedList<WarPlayer<C>>(players)){
            System.out.printf("%s: %d cards", p, p.cards.size());
            if(p.cards.size() < 1){
                this.players.remove(p);
                System.out.printf(" - eliminated!");
            }
            System.out.printf("\n");
        }

        if(players.size() == 1) {
            winner = players.get(0);
            return;
        }

        sc.nextLine();

    }

    private WarPlayer<C> playRoundInternal(WarRoundState<C> state){
        state.playCards();
        state.eliminateLosers();
        WarPlayer<C> winner = state.detectSingleWinner();
        if(winner == null){
            state.playCards(); state.playCards(); state.playCards();
            return playRoundInternal(state);
        } else {
            return winner;
        }
    }
}
