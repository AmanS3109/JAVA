package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
//        RevNum(1824);
//        System.out.println(sum);
        System.out.println(RevNUm2(8932));
    }
    static int sum = 0;
    static void RevNum(int n){
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        RevNum(n/10);
    }
    static int RevNUm2(int n){
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
}
