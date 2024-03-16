package Recursion;

public class ProductsOfDigits {
    public static void main(String[] args) {
        System.out.println(digits(505));
    }
    static int digits(int n){
        if (n%10 == n){
            return n;
        }
        return digits(n /10) * (n % 10);
    }
}
