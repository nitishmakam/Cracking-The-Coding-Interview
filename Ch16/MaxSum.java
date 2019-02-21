import java.util.Scanner;

class MaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(maxSum(array));
        sc.close();
    }

    static int maxSum(int[] array) {
        int maxsum = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (maxsum < sum) {
                maxsum = sum;
            } else if (sum < 0) {
                sum = 0;
            }
        }
        return maxsum;
    }
}