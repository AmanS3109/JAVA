public class skipString {
    public static void main(String[] args) {
        System.out.println(skip("amazingapple"));
    }
    static String skip(String up){
        //base case
        if(up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
           return skip(up.substring(5));
        }else{
            return up.charAt(0) + skip(up.substring(1));
        }
    }
}