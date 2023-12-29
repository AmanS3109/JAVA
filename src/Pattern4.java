public class Pattern4 {
    public static void main(String[] args) {
        patten4(4);
    }

    static void patten4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                //here we are printing column number in each row
                System.out.print(col);
            }
            System.out.println();
        }
    }

}
