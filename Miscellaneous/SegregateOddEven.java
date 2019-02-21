import java.util.Scanner;

class SegregateOddEven {
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
        head = segregate(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.print("\n");
        sc.close();
    }

    static Node segregate(Node head) {
        Node temp = head;
        Node oddStart = null, oddEnd = null, evenStart = null, evenEnd = null;
        while (temp != null) {
            if (temp.data % 2 == 0) {
                if (evenStart == null) {
                    evenStart = temp;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = temp;
                    evenEnd = evenEnd.next;
                }
            } else {
                if (oddStart == null) {
                    oddStart = temp;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = temp;
                    oddEnd = oddEnd.next;
                }
            }
            temp = temp.next;
        }
        if (evenStart == null || oddStart == null) {
            return (evenStart == null) ? oddStart : evenStart;
        }
        evenEnd.next = oddStart;
        oddEnd.next = null;
        return evenStart;
    }
}