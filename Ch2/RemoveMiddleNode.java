import java.util.*;

class RemoveMiddleNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("Enter the number of nodes");
        int n = sc.nextInt();
        System.out.println("Enter values");
        head = new Node(sc.nextInt());
        Node temp = head;
        Node removeNode=null;
        for (int i = 1; i < n; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
            if (i == (n / 2))
                removeNode = temp;
        }
        removemiddlenode(removeNode);
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
    static void removemiddlenode(Node n){
        if(n==null || n.next==null)
            return;
        else{
            Node next =  n.next;
            n.data=next.data;
            n.next=next.next;
            return;
        }
    }
}