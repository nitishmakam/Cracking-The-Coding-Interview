import java.util.*;

class ReOrderLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("Enter the number of nodes");
        int n = sc.nextInt();
        System.out.println("Enter values");
        head = new Node(sc.nextInt());
        Node temp = head;
        for (int i = 1; i < n; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = reverseLinkedList(slow.next);
        slow.next = null;
        head = mergeLists(head, mid);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.print("\n");
        sc.close();
    }

    static Node reverseLinkedList(Node head) {
        Node current = head, prev = null, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    static Node mergeLists(Node head1, Node head2) {
        Node temp1 = head1, temp2 = head2;
        Node nexthead1 = null, nexthead2 = null;
        while (temp2 != null) {
            nexthead1 = temp1.next;
            nexthead2 = temp2.next;
            temp1.next = temp2;
            temp2.next = nexthead1;
            temp1 = nexthead1;
            temp2 = nexthead2;
        }
        return head1;
    }
}

class Node {
    int data;
    Node next;

    public Node(int d) {
        this.data = d;
    }
}