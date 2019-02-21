import java.util.Scanner;

class NumberOf2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        System.out.println(countNumberOf2s(n));
        sc.close();
    }

    static int countNumberOf2s(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            count += numberof2s(i);
        }
        return count;
    }

    static int numberof2s(int i) {
        int count = 0;
        while (i > 0) {
            if (i % 10 == 2) {
                count++;
            }
            i /= 10;
        }
        return count;
    }
}