public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {90, 75, 18, 12, 6, 4, 3, 1};
        int target = 75;
        int ans = orderSearch(arr, target);
        System.out.println(ans);
    }
    static int orderSearch(int[]arr, int target){
        int i = 0;
        int j = arr.length-1;
        // To find whether the array is in ascending order or not
        boolean isAsc = arr[i] < arr[j];
        while (i <= j){
            int mid = i + (j-i)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    j =mid -1;
                } else {
                    i = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    j =mid -1;
                } else {
                    i = mid + 1;
                }
            }
        }
        return -1;
    }
}
