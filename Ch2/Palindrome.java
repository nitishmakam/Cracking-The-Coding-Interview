import java.util.*;

class Palindrome {
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
        System.out.println(isPalindrome(head));
        sc.close();
    }

   static boolean isPalindrome(Node n){
       Node p1=n;
       Node p2=n;
       Stack<Integer> st=new Stack<Integer>();
       while(p2!=null && p2.next!=null){
           st.push(p1.data);
            p1=p1.next;
           p2=p2.next.next;
       }
       if(p2!=null){
           p1=p1.next;
       }
       while(p1!=null){
           if(st.pop()!=p1.data){
               return false;
           }
           p1=p1.next;
       }
       return st.isEmpty();
   }
}