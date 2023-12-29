import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Aman";
        char target = 'm';
//        boolean ans = search(name, target);
//        System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
