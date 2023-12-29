package Recursion;

//NUMBER EXAMPLE
public class Recursion1 {
    public static void main(String[] args) {
        number(1);
    }
    static void number(int n){
        if (n == 5){
            return;
        }
        System.out.println(n);
        number(n + 1 );
    }
}
