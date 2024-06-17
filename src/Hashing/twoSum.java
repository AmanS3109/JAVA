package Hashing;

import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 22;
        System.out.println(Arrays.toString(TwoSum(arr, target)));
    }
    static int[] TwoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int curr_index = arr[i];
            int y = target - curr_index;
            if (map.containsKey(y)){
                return new int[]{i, map.get(y)};
            }
            map.put(curr_index, i);
        }
        return new int[]{};
    }
}
