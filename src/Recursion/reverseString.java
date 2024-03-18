package Recursion;

public class reverseString {
    public static void main(String[] args) {
        char[] s = "hello".toCharArray();
        ReverseString(s); // Call the method directly
        System.out.println(s); // Print the reversed string
    }
    public static void ReverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    private static void reverse(char[] s, int left, int right) {
        if (left >= right) {
            return;
        }

        // Swap characters at left and right pointers
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        // Recursive call with updated pointers
        reverse(s, left + 1, right - 1);
    }
}

