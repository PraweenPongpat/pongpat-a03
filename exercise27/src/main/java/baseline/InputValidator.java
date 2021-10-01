package baseline;

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
        String resultFN = firstNameValidator(firstName);
        //call lastNameValidator on lastName
        String resultLN = lastNameValidator(lastName);
        //call ZIPValidator on zipCode
        String resultZIP = ZIPValidator(zipCode);
        //call employeeValidator on employeeID
        String resultEID = employeeValidator(employeeID);

        //if all strings results are "passed"
        //return "There were no errors found"

        //format the string of results in proper format
        //return it
        return String.format("");
    }

    private String firstNameValidator(String firstName) {
        //convert firstName to char Array
        //if array is empty, return "The first name must be filled in."
        //if length of array < 2, return "The first name must be at least 2 characters long"
        //if array contains only letters, and has length more than 2,  return "passed"
        //if array as other than letters, and longer than 2, return "The first name must be only letters"
        return "";
    }

    private String lastNameValidator(String lastName) {
        //convert lastName to char Array
        //if array is empty, return "The last name must be filled in."
        //if length of array < 2, return "The last name must be at least 2 characters long"
        //if string contains only letters, and has length more than 2,  return "passed"
        //if array as other than letters, and longer than 2, return "The last name must be only letters"
        return "";
    }

    private String ZIPValidator(String zipCode) {
        //convert zipCode to char Array
        //if zip code has only 5 digits, return "passed"
        //otherwise, return "The zipcode must be a 5-digit number."
        return "";
    }

    private String employeeValidator(String employeeID) {
        //convert employeeID to char Array
        //if array has length not equal to 7, return "The employee ID must in the format AA-1234."
        //if the first two characters are letters
        //      if the third character is a hyphen
        //              if the next for characters are digits
        //                      all these passes, return "passed"
        //otherwise, return "The employee ID must in the format AA-1234."
        return "";
    }

    private char[] stringToLowercaseCharArrayConverter(String string){
        //convert string to lowercase
        //convert the lowercase-string input to char array
        //return that char array
        return string.toCharArray();
    }
}
