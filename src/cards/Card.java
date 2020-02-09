package cards;

/**
 *
 * @author knrta
 */
public abstract class Card {
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    @Override
    public abstract String toString();

    /**
     * using Black Magic™, print a debug message with the caller's name and this card's string.
     */
    protected final void tell(){
        String caller = new Throwable().fillInStackTrace().getStackTrace()[1].toString();
        String self = this.getClass().getSimpleName();
        System.err.printf("%s: (%s) %s", caller, self, this.toString());
    }

}
