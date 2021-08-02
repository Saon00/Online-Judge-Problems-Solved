import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        if (line.matches("[A-Z]*"))
            System.out.println(line.toLowerCase());
        else if (line.matches("[a-z][A-Z]*"))
            System.out.println(Character.toUpperCase(line.charAt(0)) + line.substring(1).toLowerCase());
        else
            System.out.println(line);
    }
}

// https://codeforces.com/problemset/problem/131/A
