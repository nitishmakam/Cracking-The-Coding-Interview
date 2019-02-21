import java.util.Scanner;
import java.util.Arrays;

class FindSmallestDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("2nd array");
        int m = sc.nextInt();
        int[] array2 = new int[m];
        for(int i=0;i<m;i++){
            array2[i]=sc.nextInt();
        }
        System.out.println(findSmallestDifference(array1, array2));
        sc.close();
    }

    static int findSmallestDifference(int[] array1, int[] array2) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(array1);
        Arrays.sort(array2);
        int a = 0;
        int b = 0;
        while (a < array1.length && b < array2.length) {
            if (Math.abs(array1[a] - array2[b]) < min) {
                min = Math.abs(array1[a] - array2[b]);
            }
            if (array1[a] < array2[b]) {
                a++;
            } else {
                b++;
            }
        }
        return min;
    }
}