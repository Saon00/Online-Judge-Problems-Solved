import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine().replaceAll("[{, }}]*", "");
        System.out.println(line.chars().distinct().count());
    }
}

// https://codeforces.com/problemset/problem/443/A

/* Python3
print(len(set(input()+', '))-4)
*/
