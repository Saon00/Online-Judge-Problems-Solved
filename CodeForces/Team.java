public class Team {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        int d = 0;

        while (t-- > 0) {

            int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
            int result = (a + b + c >= 2) ? d++ : d;

        }
        System.out.println(d);


    }
}
