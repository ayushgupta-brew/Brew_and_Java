package Linked_Lists;

public class LinkedListImpl implements LinkedListOperations {

    private static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private int size;


    @Override
    public void insertAtFront(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
        size++;
    }

    @Override
    public void insertAtBack(int data){
        Node newNode = new Node(data);

        if(head == null){
            insertAtFront(data);
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    public void printList() {
        Node current = head;

        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
