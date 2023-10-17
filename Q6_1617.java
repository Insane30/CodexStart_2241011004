/*
 * Name :Ayush kachhap
 * regd_no: 2241011004
 * link:https://cses.fi/problemset/task/1617
 */
import java.util.Scanner;

public class Q6_1617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        long ans = power(2, n, 1000000007);
        System.out.println(ans);
    }

    public static long power(long x, int y, int p) {
        long res = 1;
        x = x % p;


        while (y > 0) {
            if (y % 2 == 1)
                res = (res * x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }

        return res;
    }
}
