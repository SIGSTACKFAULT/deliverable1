package war;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

import cards.RegularCard;

public class WarRoundState<C extends RegularCard> extends HashMap<WarPlayer<C>, LinkedList<C>> {
    public WarRoundState(List<WarPlayer<C>> players){
        super();
        for(WarPlayer<C> p : players){
            this.put(p, new LinkedList<C>());
        }
    }

    public List<C> collectCards(){
        List<C> r = new LinkedList<C>();
        for(LinkedList<C> ll : this.values()){
            r.addAll(ll);
        }
        return r;
    }

    public void giveCardsTo(WarPlayer<C> p){
        p.cards.addAll(collectCards());
    }
}
