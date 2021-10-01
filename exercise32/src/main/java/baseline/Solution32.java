/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.Scanner;

public class Solution32 {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //allocate Solution32
        Solution32 sol = new Solution32();

        //prompt user for entering the game
        System.out.println("Let's play Guess the Number!");

        //allocate Guessing game class
        GuessingGame game = new GuessingGame();

        //set a flag variable, used to get out of loop
        boolean keepGoing = true;
        int level;
        while (keepGoing){
            //prompt user to enter the difficulty
            level = sol.getLevelDifficulty();
            //call the game
            keepGoing = game.guessingGameApp(level);
            //check if user want to continue the game
            if(!keepGoing)
                break;
        }
        System.out.println("No more games! Good Bye!");
    }

    private int getLevelDifficulty(){
        //make a loop
        int level;
        while(true){
            //prompt user to enter integer 1 2 or 3 only
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            //read users input
            //if user enter non-numerical number
            //or if user enter other than 1 2 3,
            //      display: "difficulty ranges is only 1, 2, 3: please re-enter"
            //          go back to start position of loop, ask again
            //if user enter 1 or 2 or 3, get out of loop
            //return that value
            try{
                level = Integer.parseInt(input.nextLine());
                if((level <1) || (level> 3))
                    throw new NumberFormatException();
                return level;
            } catch (NumberFormatException nfe){
                System.out.println("difficulty ranges is only 1, 2, 3: please re-enter");
            }
        }
    }
}
