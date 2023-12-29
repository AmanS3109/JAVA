import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(89);
//        list.add(679);
//        list.add(676);

//        System.out.println(list.contains(89));
//        System.out.println(list);
//        list.set(0, 23);
//        list.remove(2);
//        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}