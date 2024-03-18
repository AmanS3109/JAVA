package Recursion;

public class PassingNumber {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n) {
        if (n==0){
            return;
        }
        System.out.println(n);
        // fun(n--);    results in stack overflow
        fun(--n);
    }
}
