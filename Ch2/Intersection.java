import java.util.*;

class Result {
    public Node tail;
    public int size;

    public Result(Node tail, int size) {
        this.tail = tail;
        this.size = size;
    }
}

class Intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of nodes for list 1");
        int n = sc.nextInt();
        Node head1 = new Node(sc.nextInt());
        Node temp = head1;
        Node temp3 = null;
        for (int i = 1; i < n; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
            if (i == 3)
                temp3 = temp;
        }
        System.out.println("Enter no of nodes for list 2");
        int k = sc.nextInt();
        Node head2 = new Node(sc.nextInt());
        temp = head2;
        for (int i = 1; i < k; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }
        temp.next = temp3;
        System.out.println("Original list 1");
        temp = head1;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Original list 2");
        temp = head2;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        Node inter = findIntersection(head1, head2);
        System.out.println();
        System.out.println(inter.data);
        sc.close();
    }

    static Result findLastAndSize(Node n) {
        int k = 0;
        while (n.next != null) {
            k++;
            n = n.next;
        }
        return new Result(n, k);
    }

    static Node getKthNode(Node n, int k) {
        Node current = n;
        while (k > 0 && current != null) {
            current = current.next;
            k--;
        }
        return current;
    }

    static Node findIntersection(Node n1, Node n2) {
        if (n1 == null || n2 == null)
            return null;

        Result result1 = findLastAndSize(n1);
        Result result2 = findLastAndSize(n2);

        if (result1.tail != result2.tail)
            return null;

        Node shorter = result1.size < result2.size ? n1 : n2;
        Node longer = result1.size < result2.size ? n2 : n1;

        longer = getKthNode(longer,Math.abs(result1.size-result2.size));

        while(longer!=shorter){
            longer=longer.next;
            shorter=shorter.next;
        }

        return longer;
    }
}