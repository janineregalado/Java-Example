package TestPackages;


import com.janineregalado.java.Calculator;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testMultiplication(){

        double a = 10.0;
        double b = 5.0;

        double add = 15.0;
        double sub = 5.0;
        double mul = 50.0;
        double div = 2.0;

        double result1 = Calculator.addition(a,b);
        double result2 = Calculator.subtraction(a,b);
        double result3 = Calculator.multiplication(a,b);
        double result4 = Calculator.division(a,b);

        assertEquals(add,result1,0.001);
        assertEquals(sub,result2,0.001);
        assertEquals(mul,result3,0.001);
        assertEquals(div,result4,0.001);


        }
}
