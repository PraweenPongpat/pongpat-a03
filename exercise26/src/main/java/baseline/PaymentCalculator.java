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
    //declare setters, use on test purposes only, hence no validation needed
    //the validation are already included when taking in input
    public void setDailyAPR(double newAPR){
        dailyAPR = newAPR;
    }
    public void setBalance(double newBalance){
        balance = newBalance;
    }
    public void setMonthlyPayment(double newMonthlyPay){
        monthlyPayment = newMonthlyPay;
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
        int result = numMonthCalculator(getDailyAPR(),roundIt(getBalance()),getMonthlyPayment());
        //return the result
        return result;
    }

    //this method is used to calculate the math only
    private int numMonthCalculator(double dailyAPR, double balance, double monthlyPayment){
        //calculate from the formula given:  n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //round up the number to next integer, return the value
        return (int)Math.ceil((-1/30.0)*Math.log10(1+roundIt(balance/monthlyPayment)*(1-Math.pow(1+dailyAPR,30)))/Math.log10(1+dailyAPR));
    }

    //use only to round number up
    private double roundIt(double value){
        return Math.ceil(value*100.00)/100.00;
    }

}
