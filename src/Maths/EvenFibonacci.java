package Maths;

public class EvenFibonacci {
        public static void main(String[] args) {
            int limit = 4000000;
            int sum = 0;
            int a = 1;
            int b = 2;

            while (a <= limit) {
                if (a % 2 == 0) {
                    sum += a;
                }
                int next = a + b;
                a = b;
                b = next;
            }

            System.out.println("The sum of the even-valued terms in the Fibonacci sequence whose values do not exceed four million is: " + sum);
        }
}

