public class sqRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(4));
    }
    static int sqrt(int x){
        int left = 0;
        int right = x;
        int result = 0;
        while (left <= right){
            int mid = left + ((right - left) / 2);
            if (mid <= x / mid){
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
