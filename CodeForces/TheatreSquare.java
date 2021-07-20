import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong(), m = scan.nextLong(), a = scan.nextLong();
        long result = n % a == 0 ? n / a : n / a + 1;
        result = result * (m % a == 0 ? m / a : m / a + 1);
        System.out.println(result);
        
    }
}
