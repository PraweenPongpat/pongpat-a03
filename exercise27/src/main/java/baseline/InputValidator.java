package baseline;

public class InputValidator {
    //make variables as needed
    private static final String PASSED = "passed";

    public String validateInput(String firstName, String lastName, String zipCode, String employeeID) {
        //call firstNameValidator on firstName
        String resultFN = nameValidator(firstName,"first");
        //call lastNameValidator on lastName
        String resultLN = nameValidator(lastName,"last");
        //call ZIPValidator on zipCode
        String resultZIP = zipValidator(zipCode);
        //call employeeValidator on employeeID
        String resultEID = employeeValidator(employeeID);

        //if all strings results are "passed"
        //return "There were no errors found."
        if((resultFN.equals(PASSED))&&(resultLN.equals(PASSED))
                &&(resultZIP.equals(PASSED))&&(resultEID.equals(PASSED)))
            return "There were errors found.";

        //format the string of results in proper format
        //return it
        return stringAppender(resultFN,resultLN,resultZIP,resultEID);
    }

    public String nameValidator(String name, String key) {
        //convert firstName to char Array
        char[] nameArr = stringToCharArrayConverter(name);
        //if array is empty, return "The first/last name must be filled in."
        //if length of array < 2, return "The first/last name must be at least 2 characters long"
        //if array contains only letters, and has length more than 2,  return "passed"
        //if array as other than letters, and longer than 2, return "The first/last name must be only letters"
        if(nameArr.length == 0)
            return "The "+key+" name must be filled in.";
        else if(nameArr.length<2)
            return "The "+key+" name must be at least 2 characters long.";
        else{
            for (char c : nameArr) {
                if (!(Character.isAlphabetic(c)))
                    return "The " + key + " name must be only letters.";
            }
            return PASSED;
        }
    }

    public String zipValidator(String zipCode) {
        //convert zipCode to char Array
        char[] zipCodeArr = stringToCharArrayConverter(zipCode);

        //if the length is not 5, return "The zipcode must be a 5-digit number."
        if(zipCodeArr.length!=5)
            return "The zipcode must be a 5-digit number.";
        //go through array, check each index must be digit
        for (char c : zipCodeArr) {
            //if it is not digit,
            if (!(Character.isDigit(c)))
                return "The zipcode must be a 5-digit number.";
        }
        //otherwise, return "passed"
        return PASSED;
    }

    public String employeeValidator(String employeeID) {
        //convert employeeID to char Array
        char[] employeeIDArr = stringToCharArrayConverter(employeeID);
        //if array has length not equal to 7, return "The employee ID must in the format AA-1234."
        //if the first two characters are letters
        //      if the third character is a hyphen
        //              if the next for characters are digits
        //                      all these passes, return "passed"
        if(employeeIDArr.length==7) {
            if (Character.isAlphabetic(employeeIDArr[0]) && Character.isAlphabetic(employeeIDArr[1])
                    && employeeIDArr[2] == '-') {
                    for(int i=3; i<employeeIDArr.length; i++){
                        if(!(Character.isDigit(employeeIDArr[i])))
                            return "The employee ID must in the format AA-1234.";
                    }
                return PASSED;
            }
        }
        //otherwise, return "The employee ID must in the format AA-1234."
        return "The employee ID must in the format AA-1234.";
    }

    private String stringAppender(String resultFN, String resultLN, String resultZip, String resultEID){
        String outputMessage = "";
        if(!(resultFN.equals(PASSED)))
            outputMessage = outputMessage + resultFN + "\n";
        if(!(resultLN.equals(PASSED)))
            outputMessage = outputMessage + resultLN + "\n";
        if(!(resultZip.equals(PASSED)))
            outputMessage = outputMessage + resultZip + "\n";
        if(!(resultEID.equals(PASSED)))
            outputMessage = outputMessage + resultEID;
        return outputMessage;
    }

    private char[] stringToCharArrayConverter(String string){
        //convert the lowercase-string input to char array
        //return that char array
        return string.toCharArray();
    }
}
