import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        fun(2, 4, 5, 6, 69);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
