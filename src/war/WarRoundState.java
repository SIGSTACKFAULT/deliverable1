package war;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

import cards.RegularCard;

public class WarRoundState<C extends RegularCard> extends HashMap<WarPlayer<C>, LinkedList<C>> {
    public List<C> bounty = new LinkedList<C>();
    /**
     * tracks the state of a round of war.
     * @param players list of players in the game
     */
    public WarRoundState(List<WarPlayer<C>> players){
        super();
        for(WarPlayer<C> p : players){
            this.put(p, new LinkedList<C>());
        }
    }

    /**
     * collect all the cards we're tracking and return them.
     * @return
     */
    public List<C> collectCards(){
        List<C> r = new LinkedList<C>();
        r.addAll(bounty);
        for(LinkedList<C> ll : this.values()){
            r.addAll(ll);
        }
        return r;
    }

    /**
     * give all the cards we're tracking to p
     * @param p player to give cards to
     */
    public void giveCardsTo(WarPlayer<C> p){
        p.cards.addAll(collectCards());
    }

    /**
     * each player puts down a card.
     */
    public void playCards(){
        for(WarPlayer<C> p : this.keySet()){
            this.playCard(p);
        }
    }

    /**
     * the given player puts down a card
     * @param p player
     */
    public void playCard(WarPlayer<C> p){
        this.get(p).add(p.takeCard());
    }

    /**
     * check if *one* player is currently winning
     * @return the player winning, or null on tie
     */
    public WarPlayer<C> detectSingleWinner(){
        List<WarPlayer<C>> winners = detectWinners();
        if(winners.size() == 1) return winners.get(0);
        else return null;
    }

    /**
     * list the players tied for first place.
     * may only return one, if they're the outright winner.
     * @return
     */
    public List<WarPlayer<C>> detectWinners(){
        List<WarPlayer<C>> winners = new LinkedList<WarPlayer<C>>();
        int best = getBestValue();
        for(WarPlayer<C> p : keySet()){
            if(getTopCard(p).getValue() == best){
                winners.add(p);
            }
        }
        return winners;
    }

    /**
     * @return the best of all the top values
     */
    public int getBestValue(){
        int best = 0;
        for(LinkedList<C> cards : this.values()){
            C card = cards.peekLast();
            if(card.getValue() > best) best = card.getValue();
        }
        return best;
    }

    /**
     * get the most-recently-played card by p
     * @param p player
     */
    public C getTopCard(WarPlayer<C> p){
        return this.get(p).peekLast();
    }

    /**
     * remove players whose top card isn't the best; put their cards in `bounty`
     */
    public void eliminateLosers(){
        int best = getBestValue();
        List<WarPlayer<C>> players = new LinkedList<WarPlayer<C>>(this.keySet());
        for(WarPlayer<C> p : players){
            if(getTopCard(p).getValue() < best){
                bounty.addAll(remove(p));
            }
        }
    }
}
