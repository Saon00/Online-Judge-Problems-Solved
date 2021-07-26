import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int upper = 0, lower = 0;
        for (int i = 0; i < line.length(); i++) {
//            char ch = line.charAt(i);
            if (line.charAt(i) >= 65 && line.charAt(i) <= 90) upper++;
//            if (ch >= 'a' && ch <= 'z') lower++;
        }

        System.out.println(upper <= (line.length() - upper) ? line.toLowerCase() : line.toUpperCase());

//        if(upper>lower) System.out.println(line.toUpperCase());
//        if(upper<lower) System.out.println(line.toLowerCase());
//        if(upper==lower) System.out.println(line.toLowerCase());
    }
}

// https://codeforces.com/problemset/problem/59/A
