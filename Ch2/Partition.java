import java.util.*;

class Partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of nodes");
        int n = sc.nextInt();
        System.out.println("Enter values");
        Node head = new Node(sc.nextInt());
        Node temp = head;
        for (int i = 1; i < n; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }
        System.out.println("Enter partition value");
        int d = sc.nextInt();
        head = partition(head, d);
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
        sc.close();
    }

    static Node partition(Node n,int x){
        Node head=n;
        Node tail=n;
        while(n!=null){
            Node next=n.next;
            if(n.data<x){
                n.next=head;
                head=n;
            }else{
                tail.next=n;
                tail=n;
            }
            n=next;
        }
        tail.next=null;
        return head;
    }
}