package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(12321));
    }
    static int Rev(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        int rem = n % 10;
        if (rem == n){
            return n;
        }
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n/10, digits - 1);
    }
    static boolean palin(int n){
        return n == Rev(n);
    }
}
