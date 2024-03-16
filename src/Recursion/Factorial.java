package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(product(6));
    }
    static int product(int n){  //Int is required, we can't return void because it returns some value or integer
        if (n == 1){ // Here we are returns 1 because 0 is null and even factorial of 0 is 1 (0!=1)
            return 1; // 1 is the least value in factorial
        }
        return n * product(n-1);
    }
}
