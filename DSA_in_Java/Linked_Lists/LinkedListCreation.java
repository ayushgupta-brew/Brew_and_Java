package Linked_Lists;

public class LinkedListCreation {
    public static void main(String[] args) {

        LinkedListOperations list = new LinkedListImpl();

        list.insertAtFront(10);
        list.insertAtBack(20);
        list.insertAtBack(30);
        list.insertAtBack(40);
        list.insertAtBack(40);
        list.insertAtPosition(15 , 2);
        list.deleteAtPosition(2);
        list.deleteAtFront();
        list.deleteAtBack();
        boolean answer = list.searchByData(12);

        list.reverseList();

        int size = list.getSize();
        System.out.println("Size of the List: " + size);

        list.printList();

    }
}