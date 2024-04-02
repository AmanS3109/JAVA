package Recursion;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(Search(arr, 7, 0, arr.length-1));
    }
    static int Search(int[]arr, int target, int start, int end){
        int mid = start + ((end - start) / 2);
        if (start > end){
            return -1;
        }
        if (arr[mid] == target){
            return mid;
        }
        if (arr[start] <= arr[mid]){
            if (target >= arr[start] && target <= arr[mid]){
                return Search(arr, target, start, mid-1);
            }
            return Search(arr, target, mid+1 , end);
        }
        if (target >= arr[mid] && target <= arr[end]) {
            return Search(arr, target, mid+1, end);
        }
        return Search(arr, target, start, mid-1);
    }
}
