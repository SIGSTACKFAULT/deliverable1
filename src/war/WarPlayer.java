package war;

import java.util.List;

import cards.RegularCard;
import game.Player;

public abstract class WarPlayer<C extends RegularCard> extends Player<War<C>> {
    public List<C> cards;
}
