package baseline;

public class Password {
    //variables
    private String password;

    //constructor
    public Password(String password){
        this.password = password;
    }

    public int passwordValidator(String password){
        //turn the string 'password' to array of char
        char[] passwordArr= stringToCharArrayConverter();

        //make variable needed
        int numUpper, numLower, numDigit, numSpecialChar;

        //make loop through the array
            //each iteration, check what kind of char is it, based on ASCII value
            //to each kind found, increment1 to the value

        //call strengthTranslator on length of the array and those value, store the strength level
        int strVal = strengthTranslator(arrayLength,numDigit,numLower,numUpper,numSpecialChar,);

        //return that strength level
        return 0;
    }
    public int strengthTranslator(int arrLen,int numDigit, int numLower, int numUpper, int numSpecialChar){
        //if arrLen>=8
            //if numDigit >=1, numLower>=1, numUpper>=1, numSpecialChar>=1;     return 4
            //if numDigit >=1, numLower>=1, numUpper>=1, numSpecialChar=0;     return 3
        //if arrLen<8
            //if numDigit =0, numLower>=1, numUpper>=1, numSpecialChar=0;     return 2
            //if numDigit >=1, numLower=0, numUpper=0, numSpecialChar=0;     return 1
        //other wise, return 0
        return 0;
    }

    private char[] stringToCharArrayConverter(String something){
        //convert String to char[]
        //return the char[]
        return someCharArray;
    }
}
