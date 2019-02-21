import java.util.Scanner;

class CountFactZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countfactzeros(n));
        sc.close();
    }

    static int countfactzeros(int num) {
        int count = 0;
        if (num < 0) {
            return -1;
        }
        for (int i = 5; num / i > 0; i *= 5) {
            count += num / i;
        }
        return count;
    }
}