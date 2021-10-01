package baseline;

import java.util.Locale;
import java.util.Random;

import static baseline.Solution32.input;

public class GuessingGame {
    Random rand = new Random();
    public boolean guessingGameApp(int level) {
        //declare variables
        int max = (int) Math.pow(10,level)  ;      //max depends on level: 10^level
        int answer = (rand.nextInt(max-1))+1;     //generate random number between 1 and max

        //if needed to check answer
        System.out.println("The answer is "+ answer);

        //set the first guess from user
        int guessingValue = getGuessNum("I have my number. What's your guess?: ",0);
        int numGuessed=1;   //track number fo guesses
        String prompt;

        //if it is first guess, shouldn't be in the loop from the start
        //if the guess is right, it will get out of loop
        while(guessingValue!=answer){

            //determine prompt whether too high or too low
            prompt = determinePrompt(answer,guessingValue);

            //using that prompt, get the other number
            guessingValue = getGuessNum(prompt,guessingValue);

            //increment numGuessed by 1
            numGuessed++;
        }
        //display the number of guesses
        System.out.println("You got it in "+ numGuessed + " guesses!");

        //call the isContinue
        //return that value
        return isContinue();
    }
    public String determinePrompt(int answer, int guessingValue) {
        return (guessingValue > answer) ? "Too High! guess again: " : "Too Low! guess again: ";
    }

    private int getGuessNum(String prompt,int currentValue){
        //display prompt to user
        System.out.print(prompt);
        //read users input
        //if user enter non-numerical number
        //        display: "you have entered non-numerical answer, WRONG!"
        //              return currentValue
        //return that value
        try {
            return Integer.parseInt(input.nextLine());
        } catch (NumberFormatException nfe){
            System.out.println("you have entered non-numerical answer, WRONG!");
        }
        return currentValue;
    }

    private boolean isContinue(){
        //prompt user to enter Y/y or N/n
        System.out.println("\nDo you wish to play again (Y/N)?: ");
        //read user input
        //convert to lowercase
        String yesOrNo = input.nextLine().toLowerCase(Locale.ROOT);
        return yesOrNo.equals("yes") || yesOrNo.equals("y");
    }
}
