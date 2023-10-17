/*
 * Name :Ayush kachhap
 * regd_no: 2241011004
 * link:https://cses.fi/problemset/task/1069
 */
import java.util.*;
public class Q3_1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        //checking for the longest subsequence
        int count = 1;
        int maxCount = 1;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
                maxCount = Math.max(maxCount, count);
            }else{
                count = 1;
            }
        } 
        System.out.println(maxCount);
    }
}
