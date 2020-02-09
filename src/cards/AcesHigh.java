package cards;

public class AcesHigh extends RegularCard implements Comparable<AcesHigh> {
    public AcesHigh(Suit suit, int value){
        super(suit, value);

        assert value > 0;
        assert value < 14;

        // make aces high
        if(this.value == 1){
            this.value = 14;
        }
    }

    /**
     * Compare this to another card of the same type
     * @throws IllegalArgumentException if `other` is a different type
     * @param other card to compare
     * @return <0 if this card has a smaller value, 0 if same, >0 if larger
     */
    public int compareTo(AcesHigh other){
        return this.getValue() - other.getValue();
    }
}
