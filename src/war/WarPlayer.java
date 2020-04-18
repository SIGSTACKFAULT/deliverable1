package war;

import java.util.List;
import java.util.ArrayList;

import cards.RegularCard;
import game.Player;

public class WarPlayer<C extends RegularCard> extends Player<War<C>> {
    public List<C> cards;

    public WarPlayer(String name){
        super(name);
        cards = new ArrayList<C>();
    }

    public WarPlayer(){
        this(makePlayerName());
    }

    public void giveCard(C c){
        cards.add(c);
    }
}
