import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
/*
        int[] ros = new int[5];
        System.out.println(ros[0]);
        String[] words = new String[4];
        System.out.println(words[0]);
*/
        //Input Array
        //array of primitive
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(java.util.Arrays.toString(arr));
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        for (int num : arr) {
//            System.out.print(num + " "); // here num represents elements of array
//        }
        //arrays of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.print(java.util.Arrays.toString(str));

    }
}


