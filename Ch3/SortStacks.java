import java.util.*;

class SortStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }
        sort(st);
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.print("\n");
        sc.close();
    }

    static void sort(Stack<Integer> s) {
        Stack<Integer> t = new Stack<Integer>();
        while (!s.isEmpty()) {
            int tmp = s.pop();
            while (!t.isEmpty() && t.peek() > tmp) {
                s.push(t.pop());
            }
            t.push(tmp);
        }

        while (!t.isEmpty())
            s.push(t.pop());
    }
}