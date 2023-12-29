public class CircularLinkedList {
    public static void main(String[] args) {
        OwnCLL list = new OwnCLL();
        list.insert(5);
        list.insert(9);
        list.display();
        list.delete(9);
        list.display();
    }
}
