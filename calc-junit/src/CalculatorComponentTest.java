import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorComponentTest {



    private final Calculator calculator = new Calculator();

    @Test

    public void add_twoPositives_returnsSum(){
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void add_positiveAndNegative_returnsCorrectSum(){
        assertEquals(1,calculator.add(5,-4));
    }

    @Test
    public void add_withZero_returnsSameNumber() {
        assertEquals(10, calculator.add(10, 0));
    }

    @Test
    public void subtract_twoPositives_returnsDifference() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void subtract_negativeFromPositive_returnsSum() {
        assertEquals(8, calculator.subtract(5, -3));
    }

    @Test
    public void subtract_twoNegatives_returnsCorrectDifference() {
        assertEquals(-2, calculator.subtract(-5, -3));
    }

    @Test
    public void multiply_twoPositives_returnsProduct() {
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    public void multiply_byZero_returnsZero() {
        assertEquals(0, calculator.multiply(100, 0));
    }

    @Test
    public void multiply_positiveAndNegative_returnsNegativeProduct() {
        assertEquals(-20, calculator.multiply(4, -5));
    }

    @Test
    public void divide_twoPositives_returnsQuotient() {
        assertEquals(3, calculator.divide(10, 3));
    }

    @Test
    public void divide_negativeByPositive_returnsNegativeQuotient() {
        assertEquals(-2, calculator.divide(-10, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void divide_zeroDivisor_throwsIllegalArgumentException() {
        calculator.divide(10, 0);
    }

}
