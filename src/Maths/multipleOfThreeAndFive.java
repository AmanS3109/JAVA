package Maths;

public class multipleOfThreeAndFive {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.println("The sum of all multiple of 3 and 5 below 1000: " + sum);
    }

}
