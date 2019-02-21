import java.util.*;
class NthToLast{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of nodes");
        int n=sc.nextInt();
        Node head=new Node(sc.nextInt());
        Node temp=head;
        for(int i=1;i<n;i++){
            temp.next=new Node(sc.nextInt());
            temp=temp.next;
        }
        System.out.println("Enter which node");
        int k=sc.nextInt();
        temp=nthtolast(head,k);
        System.out.println(temp.data);
        sc.close();
    }

   static Node nthtolast(Node n,int k){
       Node p1=n;
       Node p2=n;
        for(int i=0;i<k;i++){
            p1=p1.next;
        }
        while(p1!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;
   }
}