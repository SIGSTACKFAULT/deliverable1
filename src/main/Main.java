package main;

import java.util.Scanner;

import cards.AcesHigh;
import cards.AcesLow;

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
            System.out.printf("ctrl-d to quit\n");
            System.out.printf("[12] > ");
            String input = sc.nextLine();
            // init game
            // close sc
            // game.play()
        }
    }
    
}
