package Linked_Lists;

public class LinkedListCreation {
    public static void main(String[] args) {

        LinkedListOperations list = new LinkedListImpl();

        list.insertAtFront(10);
        list.insertAtBack(20);
        list.insertAtBack(30);
        list.insertAtPosition(15 , 2);
        list.deleteAtPosition(2);
        list.deleteAtFront();
        list.deleteAtBack();

        int size = list.getSize();
        System.out.println("Size of the List: " + size);

        list.printList();

    }
}