package Hashing;
import java.util.*;

 // Maximum size subarray sum equals to k

public class maximumSizeSubarray {
    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println(equalsK(arr, k));
    }
    static int equalsK(int[] arr, int k){
        int sum = 0;
        int maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            int valueNeededToSubtract = sum - k;
            if (map.containsKey(valueNeededToSubtract)){
                maxLength = Math.max(maxLength, i - map.get(valueNeededToSubtract));
            }
            if (!map.containsKey(valueNeededToSubtract)){
                map.put(valueNeededToSubtract, i);
            }
        }
        return maxLength;
    }
}
