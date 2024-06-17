package Hashing;
import java.util.*;
public class contiguousArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 0, 0};
        System.out.println(contArrayBetter(arr));
    }
    static int contArr(int[]arr){
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int count0 = 0;
            int count1 = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0){
                    count0++;
                }
                else {
                    count1++;
                }
                if (count0 == count1) {
                    int currentLength = j - i + 1;
                    maxLength = Math.max(maxLength, currentLength);
                }
            }
        }
        return maxLength; // time complexity : O(n^2)
    }

    //better approach
    static int contArrayBetter(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        map.put(0, -1);  //base case
        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                sum++;
//            } else if (arr[i] == 1) {
//                sum--;
//            }
            sum += (arr[i] == 0)? 1 : -1;
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}



