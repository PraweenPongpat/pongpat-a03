package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    public void numMonthCalculator_TEST(){
        //set parameter#1 of the test
        PaymentCalculator test = new PaymentCalculator(12.0/(365.00*100),5000.00,100.00);
        double numMonthTest = test.calculateMonthsUntilPadOff();
        assertEquals(70, numMonthTest);
        //if passed, set parameter#2 of the test
        test.setDailyAPR(15.0/(365*100.00));
        test.setBalance(2000.00);
        test.setMonthlyPayment(45.00);
        numMonthTest = test.calculateMonthsUntilPadOff();
        assertEquals(66, numMonthTest);
    }

}