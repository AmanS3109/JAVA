package Maths;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 2;
        int a = 0;
        int b = 5;

        while (n > 0){
            int last = n & 1;
            n = n >> 1;
            a += last * b;
            b = b * b;
        }
        System.out.println(a);
    }
}
