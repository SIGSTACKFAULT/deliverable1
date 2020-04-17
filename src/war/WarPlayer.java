package war;

import java.util.List;
import java.util.ArrayList;

import cards.RegularCard;
import game.Player;

public abstract class WarPlayer<C extends RegularCard> extends Player<War<C>> {
    public List<C> cards;

    public WarPlayer(){
        cards = new ArrayList<C>();
    }

    public void giveCard(C c){
        cards.add(c);
    }
}
