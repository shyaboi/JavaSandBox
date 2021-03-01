import static org.junit.Assert.*;

import com.ss.lambdachoice.*;
import com.ss.divisable.*;
import com.ss.ddouble.*;
import com.ss.nox.*;
import com.ss.recursion.*;
import org.junit.*;//import all junit

public class WeekendOneTests {
    String[] testStrings = {"xsdx","fdsf","xgdfg","fdsg","xxdfxxxx"};
    // test int[]of numbers
    int[] testNums = { 9, 7, 22, 4 };
    // test boolean
    static Boolean a = true;
    // test num
    static int testNum = 33;
    // test string parsed from num
    static String testString = "" + testNum;
    // lambda choice tests

    // lambdaCouice
    // tests------------------------------------------------------------------------------------
    @Test
    // assert that is odd int input testNum int returns a boolean method true
    public void isOddTest() throws Exception {

        assertThat("Line parallelTo should be true", a, is(LambdaChoice.isOdd(testNum)));
    }

    @Test
    // assert that is odd int input testNum int returns a boolean method true
    public void isPrimeTest() throws Exception {

        // assert that is prime testNumber int input returns a boolean method
        assertThat("Line parallelTo should be true", a, is(LambdaChoice.isPrime(testNum)));
    }

    @Test
    // assert that is odd int input testNum int returns a boolean method true
    public void isPalindomeTest() throws Exception {

        // assert that is a palindrome testString String input returns a boolean method
        // true
        assertThat("Line parallelTo should be true", a, is(LambdaChoice.isPalindrome(testString)));
    }

    // END lambdaCouice
    // tests------------------------------------------------------------------------------------

    // DDouble
    // tests------------------------------------------------------------------------------------
    @Test
    // assert that is odd int input testNum int returns a boolean method true
    public void ddoubleTest() throws Exception {

        // assert that is a palindrome testString String input returns a boolean method
        // true
        assertEquals("Assertion was unsuccessful. Should be double original num", DDouble.ddouble(testNums));
    }
    // END DDouble
    // tests------------------------------------------------------------------------------------

    // Start Modulus
    // tests------------------------------------------------------------------------------------
    @Test
    // assert that is odd int input testNum int returns a boolean method true
    public void moduloTest() throws Exception {

        // assert that is a palindrome testString String input returns a boolean method
        // true
        assertEquals("Assertion was unsuccessful. Should be modulo 10", Modulus.divideByTen(testNums));

    }
    // END Modulus
    // tests------------------------------------------------------------------------------------


    // Start Recursion
    // tests------------------------------------------------------------------------------------
    @Test
    public void isSumTest() throws Exception {

        // assert that is a palindrome testString String input returns a boolean method
        // true
        assertEquals("Assertion was unsuccessful.",testNums, Recursion.isSum(testNum, testNums, testNum));

    }
    // END Recursion
    // tests------------------------------------------------------------------------------------

    // Start NoX
    // tests------------------------------------------------------------------------------------
    @Test
    // assert that is odd int input testNum int returns a boolean method true
    public void removeXTest() throws Exception {

        // assert that is a palindrome testString String input returns a boolean method
        // true
        assertNotSame("Assertion was unsuccessful. Should True",testStrings, NoX.removeX(testStrings));

    }
    // END NoX
    // tests------------------------------------------------------------------------------------


}