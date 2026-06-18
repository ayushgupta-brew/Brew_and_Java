package Linked_Lists;

/*
 * Singly Linked List Implementation
 */
public interface LinkedListOperations {

    public void insertAtFront(int data);
    public void insertAtBack(int data);
    public void insertAtPosition(int data , int position);
    public void deleteAtFront();
    public void deleteAtBack();
    public void deleteAtPosition(int position);
    public int getSize();
    public void printList();
}