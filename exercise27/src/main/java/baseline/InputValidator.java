package baseline;

import java.util.Locale;

public class InputValidator {
    //make variables as needed
    private String firstName;
    private String lastName;
    private String zipCode;
    private String employeeID;

    //constructor, to initialize without validation, validator will be in each own method
    public InputValidator(String firstName, String lastName, String zipCode, String employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
        this.employeeID = employeeID;
    }

    public String validateInput(String firstName, String lastName, String zipCode, String employeeID) {
        //call firstNameValidator on firstName
        String resultFN = nameValidator(firstName,"first");
        //call lastNameValidator on lastName
        String resultLN = nameValidator(lastName,"last");
        //call ZIPValidator on zipCode
        String resultZIP = ZIPValidator(zipCode);
        //call employeeValidator on employeeID
        String resultEID = employeeValidator(employeeID);

        //if all strings results are "passed"
        //return "There were no errors found."
        if((resultFN.equals("passed"))&&(resultLN.equals("passed"))
                &&(resultZIP.equals("passed"))&&(resultEID.equals("passed")))
            return "There were errors found.";

        //format the string of results in proper format
        //return it
        return "something";
    }

    public String nameValidator(String name, String key) {
        //convert firstName to char Array
        char[] nameArr = stringToLowercaseCharArrayConverter(name);
        //if array is empty, return "The first/last name must be filled in."
        //if length of array < 2, return "The first/last name must be at least 2 characters long"
        //if array contains only letters, and has length more than 2,  return "passed"
        //if array as other than letters, and longer than 2, return "The first/last name must be only letters"
        if(nameArr.length == 0)
            return "The "+key+" name must be filled in.";
        else if(nameArr.length<2)
            return "The "+key+" name must be at least 2 characters long.";
        else{
            for(int i = 0; i< nameArr.length; i++){
                if((Character.isAlphabetic(nameArr[i]))==false)
                    return "The "+key+" name must be only letters.";
            }
            return "passed";
        }
    }

    public String ZIPValidator(String zipCode) {
        //convert zipCode to char Array
        char[] zipCodeArr = stringToLowercaseCharArrayConverter(zipCode);

        //if the length is not 5, return "The zipcode must be a 5-digit number."
        if(zipCodeArr.length!=5)
            return "The zipcode must be a 5-digit number.";
        //go through array, check each index must be digit
        for(int i=0; i<zipCodeArr.length; i++){
            //if it is not digit,
            if((Character.isDigit(zipCodeArr[i]))==false)
                return "The zipcode must be a 5-digit number.";
        }
        //otherwise, return "passed"
        return "passed";
    }

    public String employeeValidator(String employeeID) {
        //convert employeeID to char Array
        char[] employeeIDArr = stringToLowercaseCharArrayConverter(employeeID);
        //if array has length not equal to 7, return "The employee ID must in the format AA-1234."
        //if the first two characters are letters
        //      if the third character is a hyphen
        //              if the next for characters are digits
        //                      all these passes, return "passed"
        if(employeeIDArr.length==7) {
            if (Character.isAlphabetic(employeeIDArr[0]) && Character.isAlphabetic(employeeIDArr[1])) {
                if (employeeIDArr[2] == '-') {
                    for(int i=3; i<employeeIDArr.length; i++){
                        if((Character.isDigit(employeeIDArr[i]))==false)
                            return "The employee ID must in the format AA-1234.";
                    }
                }
            }
            return "passed";
        }
        //otherwise, return "The employee ID must in the format AA-1234."
        return "The employee ID must in the format AA-1234.";
    }

    private char[] stringToLowercaseCharArrayConverter(String string){
        //convert string to lowercase
        string.toLowerCase(Locale.ROOT);
        //convert the lowercase-string input to char array
        //return that char array
        return string.toCharArray();
    }
}
