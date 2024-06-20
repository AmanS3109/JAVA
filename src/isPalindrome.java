public class isPalindrome {
    public static void main(String[] args) {
        String word = "light";
        System.out.println(isPalindrome(word));
    }
    static boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while (start < end){
            if (charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
