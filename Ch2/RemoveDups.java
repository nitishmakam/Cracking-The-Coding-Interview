import java.util.*;

class Node {
    int data;
    Node next = null;

    public Node(int n) {
        this.data = n;
    }
}

class RemoveDups {
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
        removedups(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        sc.close();
    }

    static void removedups(Node n){
        HashSet<Integer> set = new HashSet<Integer>();
        Node previous=null;
        while(n!=null){
            if(set.contains(n.data)){
                previous.next=n.next;
            }
            else{
                set.add(n.data);
                previous=n;
            }
            n=n.next;
        }
    }
}