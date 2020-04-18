package main;

import java.util.Scanner;

import cards.AcesHigh;
import cards.AcesLow;
import java.util.List;
import war.War;
import java.util.Collections;

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
            System.out.println("What is your name?");
            String input = sc.nextLine();
            War one = new War(input, List<C> deck);
            System.out.println("How many players would you like to play with "
                    + "(Choose 1, 2, 3)?");
            int PlayerNum = sc.nextInt();
            // init game
            // close sc
            //game.play()
        }
    }
    
}
