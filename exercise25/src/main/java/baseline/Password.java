package baseline;

public class Password {
    //variables
    private String password;

    //constructor
    public Password(String password){
        this.password = password;
    }

    //setter and getter to access 'password'
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

    public int passwordValidator(String password){
        //turn the string 'password' to array of char
        char[] passwordArr = stringToCharArrayConverter(password);

        //make variable needed
        int numDigit=0, numLetter=0, numSpecialChar=0;

        //make loop through the array
        for(int i=0; i < passwordArr.length; i++) {
            //each iteration, check what kind of char is it, based on ASCII value
            //to each kind found, increment1 to the value
            if (Character.isDigit(passwordArr[i]))
                numDigit++;
            else if ((Character.isUpperCase(passwordArr[i]))||(Character.isLowerCase(passwordArr[i])))
                numLetter++;
            else
                numSpecialChar++;
        }

        //call strengthTranslator on length of the array and those value, store the strength level
        //return that strength level
        return strengthTranslator(passwordArr.length,numDigit,numLetter,numSpecialChar);
    }

    private int strengthTranslator(int arrLen, int numDigit, int numLetter, int numSpecialChar){
        //if arrLen>=8
        if(arrLen>=8) {
            //if numDigit >=1, numLower>=1, numUpper>=1, numSpecialChar>=1;     return 4
            if((numDigit>=1) && (numLetter>=1) && (numSpecialChar>=1))
                return 4;
            //if numDigit >=1, numLower>=1, numUpper>=1, numSpecialChar=0;     return 3
            else if ((numDigit>=1) && (numLetter>=1) && (numSpecialChar==0))
                return 3;
        }
        //if arrLen<8, or condition above is not met
        //if numDigit=0, numLower>=1, numUpper>=1, numSpecialChar=0;     return 2
        if ((numDigit==0) && (numLetter>=1) && (numSpecialChar==0))
            return 2;
        //if numDigit >=1, numLower=0, numUpper=0, numSpecialChar=0;     return 1
        else if((numDigit>=1) && (numLetter==0) && (numSpecialChar==0))
            return 1;

        //otherwise, return 0
        return 0;
    }

    private char[] stringToCharArrayConverter(String string){
        //convert String to char[]
        //return the char[]
        return string.toCharArray();
    }
}
