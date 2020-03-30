package cards;

import cards.RegularCard.*;


public class AcesLow extends RegularCard implements Comparable<AcesLow> { 
    public AcesLow(Suit suit, int value){
        super(suit, value);
        
        assert value > 0;
        assert value < 14;
        
        // make aces low
        if(this.value == 14){
            this.value = 1;
        }

    }

	/**
	 * 
	 * @param suit
	 * @param value
	 */


	/**
	 * 
	 * @param other
	 */
	public int compareTo(AcesLow other) {
            return this.getValue() - other.getValue();
	}

}