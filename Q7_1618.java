/*
 * Name :Ayush kachhap
 * regd_no: 2241011004
 * link:https://cses.fi/problemset/task/1618
 */
import java.util.*;
public class Q7_1618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = 0;
        for(long i  = 5; i <=n; i= i*5){
            res = res + n/i;
        }
        System.out.println(res);
    }
}
