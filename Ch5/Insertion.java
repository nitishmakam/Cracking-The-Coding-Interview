import java.util.*;

class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(insert(n, m, i, j));
        sc.close();
    }

    static int insert(int n, int m, int i, int j) {
        int allones = ~0;

        int left = allones<<(j+1);

        int right = (1<<i)-1;

        int mask = left|right;

        int n_cleared = n & mask;

        m=m<<i;

        return n_cleared|m;
    }
}