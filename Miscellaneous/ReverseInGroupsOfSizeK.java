import java.util.Scanner;

class ReverseInGroupsOfSizeK {
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
        System.out.println("Enter size");
        int k = sc.nextInt();
        head = reverseingroups(head, k);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.print("\n");
        sc.close();
    }

    static Node reverseingroups(Node head, int k) {
        Node current = head, prev = null, next = null;
        int count = 0;
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next != null) {
            head.next = reverseingroups(next, k);
        }
        return prev;
    }
}