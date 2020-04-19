// it's not done :(

package main;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import cards.AcesHigh;
import cards.AcesLow;
import cards.RegularCard.Suit;
import war.War;
import war.WarPlayer;

/**
 * implements outer loop, "play again", etc.
 * @author knrta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO: check args for `--high` or `--low`
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.printf("[ctrl-d to quit]\n");
            boolean aceshigh = readAceSelection(sc);
            String name = readName(sc);
            int botCount = readPlayers(sc);

            String gameName = name + "'s war game";

            // SCREW IT
            War<?> war;
            if(aceshigh) {
                List<WarPlayer<AcesHigh>> players = new LinkedList<WarPlayer<AcesHigh>>();
                players.add(new WarPlayer<AcesHigh>(name));
                for(int i=0;i<botCount;i++)
                    players.add(new WarPlayer<AcesHigh>());
                war = new War<AcesHigh>(gameName, getHighDeck(), players);
            } else {
                List<WarPlayer<AcesLow>> players = new LinkedList<WarPlayer<AcesLow>>();
                players.add(new WarPlayer<AcesLow>(name));
                for(int i=0;i<botCount;i++)
                    players.add(new WarPlayer<AcesLow>());
                war = new War<AcesLow>(gameName, getLowDeck(), players);
            }
            war.play();
        }
    }

    private static boolean readAceSelection(Scanner sc){
        System.out.printf("1. Play with aces high\n");
        System.out.printf("2. Play with aces low\n");
        while(true){
            System.out.printf("[12] >> ");
            String choice = sc.next();
            if(choice.equals("1")) return true;
            if(choice.equals("2")) return false;
        }
    }

    private static String readName(Scanner sc){
        while(true){
            System.out.printf("Name >> ");
            String name = sc.next();
            if(name.length() > 0) return name;
        }
    }

    private static int readPlayers(Scanner sc){
        System.out.printf("How many players would you like to play with?\n");
        while(true){
            System.out.printf("[1-3] >> ");
            int input = sc.nextInt();
            if(input <= 3){
                sc.nextLine();
                return input;
            }
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
