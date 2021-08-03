import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String newLine = "";
        for (String i : line.split("WUB"))
            newLine += i + " ";
        System.out.println(newLine.strip());
    }
}

// https://codeforces.com/problemset/problem/208/A

/* Python3
print(input().replace("WUB", " ").strip())
*/
