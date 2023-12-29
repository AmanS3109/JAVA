public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {25, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int ans = search(nums, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
