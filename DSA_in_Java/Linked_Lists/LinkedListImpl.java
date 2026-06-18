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
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if(position < 0 || position > size){
            throw new IndexOutOfBoundsException("Invalid Position");
        }
        if(position == 0){
            insertAtFront(data);
            return;
        }
        if(position == size){
            insertAtBack(data);
            return;
        }
        Node current = head;
        for(int i = 0 ; i < position - 1 ; i++){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    @Override
    public void deleteAtFront() {
        if(head == null){
            throw new IllegalStateException("List is empty");
        }
        head = head.next;
        size--;
    }

    @Override
    public void deleteAtBack() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        if(head.next == null){
            head = null;
            size--;
            return;
        }
        Node current = head;

        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }

    @Override
    public void deleteAtPosition(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (position == 0) {
            head = head.next;
            size--;
            return;
        }
        Node current = head;

        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        size--;
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
