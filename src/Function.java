import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        //int ans = sum2();
        //System.out.println(ans);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();
        int ans = sum3(a, b);
        System.out.println(ans);
    }
    //pass the value
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
    // return the value
    static int sum2(){
        int num1, num2, sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;
    }
    static void sum()

    {
        int num1, num2, sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.print("The sum is: " + sum);
    }
}
