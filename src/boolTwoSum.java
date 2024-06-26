public class boolTwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8, 10, 13};
        int target = 15;
        System.out.println(isPairSum(arr, target));
    }
//    static boolean isPairSum(int[] arr, int target){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target){
//                    return true;
//                }
//            }
//        }
//        return false;  // Time Complexity : O(N^2)
// }
    // better approach --> Two Pointers
    static boolean isPairSum(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int current_sum = arr[left] + arr[right];
            if (current_sum == target){
                return true;
            } else if (current_sum < target) {
                left++;
            }else {
                right--;
            }
        }
        return false; // Time Complexity = O(N)
    }
}



