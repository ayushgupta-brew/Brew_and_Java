package Linked_Lists;

public class LinkedListCreation {
    public static void main(String[] args) {

        LLoperations list = new LLoperations();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.peek();
        list.deleteUsingData(30);
    
        list.print();
        System.out.println(list.size());
    }
}
