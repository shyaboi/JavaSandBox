import com.ss.lambdachoice.*;
import com.ss.divisable.*;
import com.ss.ddouble.*;
import com.ss.nox.*;
import com.ss.recursion.*;

//declare main class to run all methods in current project dir
public class Main {

    // i am not sure how to handle the hackerank style input so will just take in
    // args one by one skip line denoting amount
    public static void main(String[] args) {
        try {

            String choice = args[0];

            // switch case to setup what method to run based on what the args[0] num is
            switch (choice) {
                /*
                 * if case 1 string is parsed to int and isOdd method is ran on input num to
                 * return boolean if num is odd or not
                 */
                case "1":
                    int num = Integer.parseInt(args[1]);
                    System.out.println(LambdaChoice.isOdd(num));
                    break;
                /*
                 * if case 2 string is parsed to int and isPrime method is ran on input num to
                 * return boolean if num is prime or not
                 */
                case "2":
                    num = Integer.parseInt(args[1]);
                    System.out.println(LambdaChoice.isPrime(num));
                    break;
                /*
                 * if case 3 string and the isPalenfrome method is ran on input num to return
                 * boolean if num is a palindrome or not
                 */
                case "3":
                    String n = args[1];
                    System.out.println(LambdaChoice.isPalindrome(n));
                    break;
                // case 10 divideByTen method that returns modules by 10 remainder
                case "10":
                    /// test cases
                    int[] t1 = { 1, 22, 93 };
                    int[] t2 = { 16, 8, 886, 8, 1 };
                    int[] t3 = { 10, 0 };
                    // return test cases after running the dividedByTen method
                    System.out.println("List adter % 10 : " + Modulus.divideByTen(t1));
                    System.out.println("List adter % 10 : " + Modulus.divideByTen(t2));
                    System.out.println("List adter % 10 : " + Modulus.divideByTen(t3));
                    break;
                // case 22 for the DDouble class and ddouble method
                case "22":
                    int[] d1 = { 1, 2, 3 };
                    int[] d2 = { 6, 8, 6, 8, -1 };
                    int[] d3 = {};
                    // print out test case returns
                    System.out.println("List after doubling : " + DDouble.ddouble(d1));
                    System.out.println("List after doubling : " + DDouble.ddouble(d2));
                    System.out.println("List after doubling : " + DDouble.ddouble(d3));
                    break;
                // case x for the NoX class and the removeX methos
                case "x":
                    // test string lists
                    String[] s1 = { "ax", "bb", "cx" };
                    String[] s2 = { "xxax", "xbxbx", "xxcx" };
                    String[] s3 = { "x" };
                    // print out test case returns
                    System.out.println(NoX.removeX(s1));
                    System.out.println(NoX.removeX(s2));
                    System.out.println(NoX.removeX(s3));
                    break;
                ///case isSum for is sum method from Recursion class
                case "isSum":
                    // test cases
                    int[] r1Arr = { 2, 4, 8, };
                    int r1Root = 0;
                    int r1Sum = 10;
                    int[] r2Arr = { 1, 2, 4, 8, 1 };
                    int r2Root = 0;
                    int r2Sum = 14;
                    int[] r3Arr = { 2, 4, 4, 8 };
                    int r3Root = 0;
                    int r3Sum = 14;
                    //sys print outs for the returning functions
                    System.out.println(Recursion.isSum(r1Root, r1Arr, r1Sum));
                    System.out.println(Recursion.isSum(r2Root, r2Arr, r2Sum));
                    System.out.println(Recursion.isSum(r3Root, r3Arr, r3Sum));
                    break;
                // default method
                default:
                    System.out.println("Please input a choice");
            }
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("Please enter a choice or a number sequence");

            // TODO: handle exception
        }
    }
}