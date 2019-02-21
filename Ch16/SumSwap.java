import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

class SumSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the 1st array");
        int a1 = sc.nextInt();
        int[] array1 = new int[a1];
        for (int i = 0; i < a1; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements of the 2nd array");
        int a2 = sc.nextInt();
        int[] array2 = new int[a2];
        for (int i = 0; i < a2; i++) {
            array2[i] = sc.nextInt();
        }
        int[] result = findSwapValues(array1, array2);
        System.out.println(result[0]);
        System.out.println(result[1]);
        sc.close();
    }

    static int sum(int[] array) {
        int sum = 0;
        for (int a : array) {
            sum += a;
        }
        return sum;
    }

    static int[] findSwapValues(int[] array1, int[] array2) {
        Integer target = getTarget(array1, array2);
        if (target == null) {
            return null;
        }
        return findDifference(array1, array2, target);
    }

    static Integer getTarget(int[] array1, int[] array2) {
        int sum1 = sum(array1);
        int sum2 = sum(array2);
        if ((sum1 - sum2) % 2 != 0) {
            return null;
        }
        return (sum1 - sum2) / 2;
    }

    static HashSet<Integer> getContents(int[] array) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int a : array) {
            set.add(a);
        }
        return set;
    }

    static int[] findDifference(int[] array1, int[] array2, int target) {
        HashSet<Integer> contents2 = getContents(array2);
        for (int one : array1) {
            int two = one - target;
            if (contents2.contains(two)) {
                int[] values = { one, two };
                return values;
            }
        }
        return null;
    }
}