public class DoublyLinkedList {
    public static void main(String[] args) {
        OwnDLL list = new OwnDLL();
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertFirst(4);
        list.insertFirst(7);
        list.insertFirst(3);
        list.Display();
        list.insertLast(8);
        list.Display();
        list.insert(9, 99);
        list.Display();
    }
}
