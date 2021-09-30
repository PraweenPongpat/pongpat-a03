package baseline;

public class PaymentCalculator {
    //declare the attribute of the class as needed
    private double dailyAPR;
    private double balance;
    private double monthlyPayment;

    //constructor, all validation is done during getDouble already, no need in constructor
    public PaymentCalculator(double dailyAPR, double balance, double monthlyPayment){
        //init variables
        this.dailyAPR = dailyAPR;
        this.balance = balance;
        this.monthlyPayment = monthlyPayment;
    }

    //declare getters
    public double getDailyAPR() {
        return dailyAPR;
    }
    public double getBalance() {
        return balance;
    }
    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    //key function, takes in no argument and return result
    public int calculateMonthsUntilPadOff() {
        //call the numMonthCalculator, pass in values
        int result = numMonthCalculator(dailyAPR,balance,monthlyPayment);
        //return the result
        return 0;
    }

    //this method is used to calculate the math only
    //      intentionally, should be private
    //      but only for @Test demo, I am going to leave it as public
    public int numMonthCalculator(double dailyAPR, double balance, double monthlyPayment){
        //assuming currentCalculation has all the data needed,
        //calculate from the formula given:
        //      n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //return the value from calculation
        return 0;
    }

}
