package DP;
import java.util.*;
public class Fibonacci {
    public static int fibonacci(int n){
        
        if (n<=1){
            return n;
        }
        int prev2 = 0;
        int prev = 1;
        for( int i = 2; i < n+1; i++){
            int cur = prev+prev2;
            prev2 = prev;
            prev = cur;
        }
        return prev;
    }
    public static void main(String[] args) {
        int x = 6;
        System.out.println(fibonacci(x));
    }
}
