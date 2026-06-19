package Linked_Lists;

public class linkedListCycle2 {
    static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head.next.next.next.next = head.next;

        Node result = detectCycle(head);
        if(result != null) System.out.println("Cycle starts at node with value: " + result.data);
        else System.out.println("No cycle found.");

    }

    public static Node detectCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
