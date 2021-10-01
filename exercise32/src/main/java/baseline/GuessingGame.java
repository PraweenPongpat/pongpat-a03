package baseline;

import static baseline.Solution32.input;

public class GuessingGame {

    public char guessingGameApp(int level) {
        //declare variables
        int min = 1;    //min = 1
        int max = (int) Math.pow(10,level)  ;      //max depends on level: 10^level
        int answer = (int)(Math.random()*(max-min+1)+min);;     //generate random number between min and max

        //display the first guess of the game
        System.out.println();

        //set the first guess from user
        int guessingValue = getGuessNum("I have my number. What's your guess?: ",0);
        int numGuessed=1;   //track number fo guesses
        String prompt="";

        //if it is first guess, shouldn't be in the loop from the start
        //if the guess is right, it will get out of loop
        while(guessingValue!=answer){
            //if guessingValue > answer
            //  set prompt to "Too High! guess again: "
            //if guessingValue < answer
            //  set prompt to "Too Low! guess again: "

            //using that prompt, get the other number
            guessingValue = getGuessNum("",guessingValue);
            //increment numGuessed by 1
        }
        //display the number of guesses
        System.out.println();

        //call the isContinue
        //return that value
        return '?';
    }
    public String determinePrompt(int answer, int guessingValue) {
        return (guessingValue > answer) ? "Too High! guess again: " : "Too Low! guess again: ";
    }

    private int getGuessNum(String prompt,int currentValue){
        //display prompt to user
        System.out.println(prompt);
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

    private char isContinue(){
        //prompt user to enter Y/y or N/n
        //read user input
        //convert to lowercase
        //return that value
        return '?';
    }
}
