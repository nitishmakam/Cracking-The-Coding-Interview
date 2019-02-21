import java.util.Scanner;

class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int[] array = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(findMissingNumber(array));
        sc.close();
    }

    static int findMissingNumber(int[] array) {
        int n = array.length;
        n = n + 1;
        int sum = n * (n + 1) / 2;
        for (int a : array) {
            sum -= a;
        }
        return sum;
    }
}