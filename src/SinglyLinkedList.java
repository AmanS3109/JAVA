//import java.util.LinkedList;
//
//public class SinglyLinkedList {
//    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(34);
//        list.push(30);
//        System.out.println(list);
//    }
//} //InBuilt LinkedList

//from our own LL

public class SinglyLinkedList {
    public static void main(String[] args) {
        OwnLL list = new OwnLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(1);
        list.insertLast(99);
        list.insert(80, 3);
        list.Display();
        System.out.println(list.deleteFirst());
        list.Display();
        System.out.println(list.deleteLast());
        list.Display();
        System.out.println(list.delete(80, 2));
        list.Display();
    }
}