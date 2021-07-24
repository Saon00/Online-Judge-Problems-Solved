import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(scanner.readLine());
        String line = scanner.readLine();
        int count = 0;
        for (int i = 0; i < n - 1; i++) {

            if (line.charAt(i) == line.charAt(i + 1))
                count++;
        }

        System.out.println(count);
    }
}

// https://codeforces.com/problemset/problem/266/A
