public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 7, 41, 52, 69, 77, 83, 91, 96, 99};
        int target = 69;
        int output = search(arr, target);
        System.out.println(output);
    }
    static int search(int[]arr, int target){
        int i = 0;
        int j = arr.length-1;
        while (i <= j){
            int mid = i + (j-i)/2;
            if (target < arr[mid]) {
                j =mid -1;
            } else if (target > arr[mid]) {
                i = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
