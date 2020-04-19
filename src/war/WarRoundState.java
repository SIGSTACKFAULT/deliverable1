package war;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

import cards.RegularCard;

public class WarRoundState<C extends RegularCard> extends HashMap<WarPlayer<C>, LinkedList<C>> {
    public List<C> bounty = new LinkedList<C>();

    public WarRoundState(List<WarPlayer<C>> players){
        super();
        for(WarPlayer<C> p : players){
            this.put(p, new LinkedList<C>());
        }
    }

    public List<C> collectCards(){
        List<C> r = new LinkedList<C>();
        r.addAll(bounty);
        for(LinkedList<C> ll : this.values()){
            r.addAll(ll);
        }
        return r;
    }

    public void giveCardsTo(WarPlayer<C> p){
        p.cards.addAll(collectCards());
    }

    public void playCards(){
        for(WarPlayer<C> p : this.keySet()){
            this.playCard(p);
        }
    }

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
     * @return the players currently tied for best card
     */
    public List<WarPlayer<C>> detectWinners(){
        List<WarPlayer<C>> winners = new LinkedList();
        int best = getBestValue();
        for(WarPlayer<C> p : this.keySet()){

        }
    }

    /**
     * @return the best of all the top values
     */
    public int getBestValue(){
        int best = 0;
        for(LinkedList<C> cards : this.values()){
            C card = cards.peekLast();
            if(c.value > best) best = c.value;
        }
        return best;
    }

    public C getTopCard(WarPlayer<C> p){
        return this.get(p).peekLast();
    }

    public void eliminateLosers(){
        int best = getBestValue();
        for(WarPlayer<C> p : this.keySet()){
            if(getTopCard(p).value < best){
                bounty.addAll(remove(p));
            }
        }
    }
}
