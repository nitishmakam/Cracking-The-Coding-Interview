import java.awt.HeadlessException;
import java.util.*;

class LoopDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("Enter the number of nodes");
        int n = sc.nextInt();
        System.out.println("Enter values");
        head = new Node(sc.nextInt());
        Node temp = head;
        Node temp2 = null;
        for (int i = 1; i < n; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
            if (i == (n / 2))
                temp2 = temp;
        }
        temp.next = temp2;
        System.out.println(loop(head).data);
        sc.close();
    }

   static Node loop(Node n){
       Node p1=n;
       Node p2=n;
       while(p2!=null && p2.next!=null){
           p1=p1.next;
           p2=p2.next.next;
           if(p1==p2)
            break;
       }
       if(p2==null || p2.next==null)
        return null;
        p1=n;
        while(p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
   }
}