import Numbers.PrimeNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersTest {

    @Test
    public void duplicateTest(){

        assertEquals(true, PrimeNumber.checkPrime(7));

    }

}