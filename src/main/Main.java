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
            System.out.printf("[12] > ");
            int aceSelection = sc.nextInt();
            boolean aceshigh;
            if(aceSelection == 1) aceshigh = true;
            else if (aceSelection == 2) aceshigh = false;
            else { sc.close(); continue; }
            
            System.out.printf("Name? ");
            String name = sc.nextLine();
            War<?> war = null;
            if(aceshigh){
                war = new War();
            }
            War one = new War(input, List<C> deck);
            System.out.println("How many players would you like to play with "
                    + "(Choose 1, 2, 3)?");
            int PlayerNum = sc.nextInt();
            // init game
            // close sc
            //game.play()
        }
    }
    
    public static List<AcesHigh> getHighDeck(){
        List<AcesHigh> out = new LinkedList<AcesHigh>();
        Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.DIAMONDS, Suit.CLUBS}
        for(Suit s : suits){
            for(int v=1;v<=13;v++){
                out.add(new AcesHigh(s, v));
            }
        }
    }
    public static List<AcesLow> getLowDeck(){
        // TODO don't repeat code
        List<AcesLow> out = new LinkedList<AcesLow>();
        Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.DIAMONDS, Suit.CLUBS}
        for(Suit s : suits){
            for(int v=1;v<=13;v++){
                out.add(new AcesLow(s, v));
            }
        }
    }
}
