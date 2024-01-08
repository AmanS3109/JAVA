package Maths;


//Find ith bit of a number
public class FindBit {
    public static void main(String[] args) {
        int num = 87;
        int position = 5;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(answer(num , position));
    }

    private static int answer(int num, int position) {
        return ((num & (1 << (position - 1))) >> (position - 1));
    }

}

