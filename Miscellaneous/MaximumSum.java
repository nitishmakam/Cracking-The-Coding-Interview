import java.util.Scanner;

class MaximumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumSumWithoutAdjacency(arr));
        sc.close();
    }

    static int maximumSumWithoutAdjacency(int[] arr) {
        int incl = arr[0];
        int excl = 0;
        int excl_new;

        for (int i = 1; i < arr.length; i++) {
            excl_new = (incl > excl) ? incl : excl;

            incl = excl + arr[i];
            excl = excl_new;
        }
        return (incl > excl) ? incl : excl;
    }
}