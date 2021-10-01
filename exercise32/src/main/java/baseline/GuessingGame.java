package baseline;

public class GuessingGame {
    private int level;

    public char guessingGameApp(int level) {
        //declare variables
        int min = 1;    //min = 1
        int max;        //max depends on level: 10^level
        int answer=0;     //generate random number between min and max

        //display the first guess of the game
        System.out.println();

        //set the first guess from user
        int guessingValue = getGuessNum("");
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
            guessingValue = getGuessNum("");
            //increment numGuessed by 1
        }
        //display the number of guesses
        System.out.println();

        //call the isContinue
        //return that value
        return '?';
    }

    public int getGuessNum(String prompt){
        //display prompt to user
        //read users input
        //if user enter non-numerical number
        //        display: "you have entered non-numerical answer, WRONG! guess again: "
        //if user enter 1 or 2 or 3, get out of loop
        //return that value
        return 0;
    }

    public char isContinue(){
        //prompt user to enter Y/y or N/n
        //read user input
        //convert to lowercase
        //return that value
        return '?';
    }
}
