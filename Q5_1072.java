/*
 * Name :Ayush kachhap
 * regd_no: 2241011004
 * link:https://cses.fi/problemset/task/1072
 */
import java.util.*;
public class Q5_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        for(long i=1;i<=n;i++) {
            long ans = ((i * i) * ((i * i) - 1)) / 2;
            ans = ans - (4 * (i - 1) * (i - 2));
            System.out.println(ans);
        }
    }   
}
