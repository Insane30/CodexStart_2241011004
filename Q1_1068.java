/*
 * Name :Ayush kachhap
 * regd_no: 2241011004
 * link:https://cses.fi/problemset/task/1068
 */
import java.util.*;

public class Q1_1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.print(n + " ");
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
               
            } else {
                n = 3 * n + 1;
              
            }
              System.out.print(n + " ");
        }
    }
}