package main;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import cards.AcesHigh;
import cards.AcesLow;
import cards.RegularCard.Suit;
import war.War;

/**
 * implements outer loop, "play again", etc.
 * @author knrta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // check args for `--high` or `--low`
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.printf("1. Play with aces high\n");
            System.out.printf("2. Play with aces low\n");
            System.out.printf("[ctrl-d to quit]\n");
            System.out.printf("[12] >> ");
            int aceSelection = sc.nextInt();
            boolean aceshigh;
            if(aceSelection == 1) aceshigh = true;
            else if (aceSelection == 2) aceshigh = false;
            else { sc.close(); continue; }
            
            sc.nextLine(); // eat buffer
            System.out.printf("Name? ");
            String name = sc.nextLine();

            System.out.printf("How many players would you like to play with?\n");
            System.out.printf("[1-3] >> ");
            int botCount = sc.nextInt();
            if(botCount > 3){ sc.close(); continue; }
            String gameName = name + "'s war game";

            War<?> war = null;
            if(aceshigh){
                war = new War<AcesHigh>(gameName, getHighDeck(), botCount);
            } else {
                war = new War<AcesHigh>(gameName, getHighDeck(), botCount);
            }

            sc.close();
            war.play();
        }
    }
    
    public static List<AcesHigh> getHighDeck(){
        List<AcesHigh> out = new LinkedList<AcesHigh>();
        Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.DIAMONDS, Suit.CLUBS};
        for(Suit s : suits){
            for(int v=1;v<=13;v++){
                out.add(new AcesHigh(s, v));
            }
        }
        return out;
    }
    public static List<AcesLow> getLowDeck(){
        // TODO don't repeat code
        List<AcesLow> out = new LinkedList<AcesLow>();
        Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.DIAMONDS, Suit.CLUBS};
        for(Suit s : suits){
            for(int v=1;v<=13;v++){
                out.add(new AcesLow(s, v));
            }
        }
        return out;
    }
}
