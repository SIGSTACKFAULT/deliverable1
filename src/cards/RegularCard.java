package cards;

/**
 * Intermediate class that both `AcesHigh` and `AcesLow` extend.
 * Actually implements most of their behaviour.
 * @author SIGSTACKFAULT
 */
public abstract class RegularCard extends Card {

    public enum Suit {
        SPADES, HEARTS, CLUBS, DIAMONDS
    };

    protected int value;
    protected Suit suit;

    // simple accessors.
    public int getValue(){return value;}
    public Suit getSuit(){return suit;}

    /**
     * Self-explanitory constructor. Subclasses should override this javadoc.
     */
    public RegularCard(Suit suit, int value){
        this.suit = suit;
        this.value = value;
    }

    /**
     * Get the full name of the given suit.
     * throws IllegalStateException if the switch falls through.
     * @param what Suit to inspect
     * @throws IllegalStateException if everything is on fire
     * @return "Spades","Hearts","Clubs","Diamonds"
     * @author SIGSTACKFAULT
     */
    public static String getSuitName(Suit what){
        switch(what){
            case SPADES:   return "Spades";
            case HEARTS:   return "Hearts";
            case CLUBS:    return "Clubs";
            case DIAMONDS: return "Diamonds";
        }
        throw new IllegalStateException("xkcd.com/2200");
    }

    /**
     * Get the full name of this card's suit.
     * @throws IllegalStateException if everything is on fire
     * @return "Spades","Hearts","Clubs","Diamonds"
     * @author SIGSTACKFAULT
     */
    public String getSuitName(){
        return RegularCard.getSuitName(this.suit);
    }

    /**
     * Get the single-char shorthand for the given suit
     * @param what Suit to inspect
     * @throws IllegalStateException if everything is on fire
     * @return 'S','H','C','D'
     * @author SIGSTACKFAULT
     */
    public static char getSuitChar(Suit what){
        switch(what){
            case SPADES:   return 'S';
            case HEARTS:   return 'H';
            case CLUBS:    return 'C';
            case DIAMONDS: return 'D';
        }
        throw new IllegalStateException("xkcd.com/2200");
    }
    
    /**
     * get the single-char shorthand for this card's suit
     * @throws IllegalStateException if everything is on fire
     * @return 'S','H','C','D'
     * @author SIGSTACKFAULT
     */
    public char getSuitChar(){
        return RegularCard.getSuitChar(this.suit);
    }


    /**
     * Returns the short card name, like "5D or KS"
     * @return abbreviated card name
     * @author SIGSTACKFAULT
     */
    public String toString(){
        return String.format("%c%d", this.getSuitChar(), this.value);
    }


    public static void factory(){}
}
