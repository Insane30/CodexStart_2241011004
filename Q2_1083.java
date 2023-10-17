/*
 * Name :Ayush kachhap
 * regd_no: 2241011004
 * link:https://cses.fi/problemset/task/1083
 */
import java.util.*;
public class Q2_1083{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
         long aSum = 0;
        for(int i = 1; i<n;i++){
            int a=sc.nextInt();
            aSum+=a;
        }
        long eSum = n*(n+1)/2;
        long ans = eSum - aSum;
       
        System.out.println(ans);
    }
}
