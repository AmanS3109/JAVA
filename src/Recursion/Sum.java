package Recursion;

public class Sum {
    public static void main(String[] args) {
        System.out.println(add(5));
    }
    static int add(int n){
        if (n == 0){
            return 0;
        }
        return n + add(n - 1);
    }
}
