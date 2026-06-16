package Linked_Lists;

class LinkedListImp{

    private Node head;
    private Node tail;
    private int size;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public Node(int data , Node next1){
            this.data = data;
            this.next = next1;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;

        if(tail == null){
            tail = node;
        }
        size+= 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            s
        }
    }
}