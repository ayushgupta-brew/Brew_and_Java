package Linked_Lists;

class LLoperations {
    private Node head;
    private int size;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void peek(){
        System.out.println(head.data);
    }

    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
        }
        head = head.next;
        size--;
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        size--;
    }

    void deleteUsingData(int data){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        if(head.data == data){
            head = head.next;
            size--;
            return;
        }

        Node temp = head;
        while(temp.next != null && temp.next.data != data){
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            size--;
        }
        
    }

    int size() {
        int size = 0;
        if (head == null) {
            System.out.println(size);
            return size;
        }
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}