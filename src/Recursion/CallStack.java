package Recursion;

public class CallStack {
    public static void main(String[] args) {
        String message = A();
        System.out.println(message);

    }
    public static String A(){
        return "Hello " + B();
    }
    public static String B(){
        return "my " + C();
    }
    public static String C(){
        return "friends";
    }
}