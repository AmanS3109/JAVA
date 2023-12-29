import java.util.Arrays;

public class ArrayFunction {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){

        arr[1] = 99;
    }
}
