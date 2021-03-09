import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
    	try(Scanner scanner = new Scanner(System.in)){
    		System.out.println(scanner.nextBigInteger().isProbablePrime(1) 
    				? "prime" : "not prime");
    	}
    }
}

/* Check this:
https://www.geeksforgeeks.org/biginteger-isprobableprime-method-in-java-with-examples/
*/
