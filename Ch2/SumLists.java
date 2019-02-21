import java.util.*;

class SumLists {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of nodes");
        int n = sc.nextInt();
        Node head1 = new Node(sc.nextInt());
        Node temp=head1;
        for(int i = 1;i<n;i++)
        {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }
        Node head2 = new Node(sc.nextInt());
        temp=head2;
        for(int i = 1;i<n;i++)
        {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }
        temp=sumLists(head1,head2);
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    static Node sumLists(Node h1,Node h2){
        return h1;       
    }

}