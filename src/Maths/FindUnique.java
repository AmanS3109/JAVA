package Maths;

public class FindUnique {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        System.out.println(XOR(array));
    }

    //Use Xor to find answer a ^ a = 0 and a ^ 0 = a
    private static int XOR(int[] array) {
        int unique = 0;
        for (int n : array){
            unique ^= n;
        }
        return unique;
    }
}
