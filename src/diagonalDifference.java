public class diagonalDifference {
    public static void main(String[] args) {
        int[][] arr = {
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };

        System.out.println(difference(arr));
    }
    static int difference(int [][] arr){
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += arr[i][i];
            secondaryDiagonalSum += arr[i][n-1-i];
        }
        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }
}
