package Recursion;

public class tripleStep {
    public static void main(String[] args) {
        System.out.println(countWays(5));

    }
    static int countWays(int n){
        if (n < 0){
            return 0;
        }
        else if (n == 0){
            return 1;
        }
        return countWays(n-1) + countWays(n-2) + countWays(n-3);
    }
}
