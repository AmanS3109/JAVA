import java.util.*;
// Google Question
public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    static List<Integer> findDisappearedNumbers(int[] nums) { //cyclic sort
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                doSwap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }
        // search for all disappeared number
        List<Integer> ans = new ArrayList<>(); // when we want to return array of numbers instead of single number
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){
                ans.add(index + 1);
            }
        }
        return ans;
    }
    static void doSwap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
