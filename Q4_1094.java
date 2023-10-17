/*
 * Name :Ayush kachhap
 * regd_no: 2241011004
 * link:https://cses.fi/problemset/task/1094
 */
import java.util.*;
public class Q4_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        long ans = 0;

        for(int i =0; i < n; i++){
            int x = sc.nextInt();
            max = Math.max(max, x);
            ans+=max-x;
        }
        System.out.println(ans);

    }
}
