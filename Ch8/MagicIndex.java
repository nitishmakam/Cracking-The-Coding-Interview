import java.util.Scanner;

class MagicIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(magicFast(array));
        sc.close();
    }

    static int magicFast(int[] array) {
        return magicFast(array, 0, array.length - 1);
    }

    static int magicFast(int[] array, int start, int end) {
        if (end < start) {
            return -1;
        }

        int midIndex = (start + end) / 2;
        int midValue = array[midIndex];
        if (midIndex == midValue) {
            return midIndex;
        }

        int leftIndex = Math.min(midIndex - 1, midValue);
        int left = magicFast(array, start, leftIndex);
        if (left >= 0) {
            return left;
        }

        int rightIndex = Math.max(midIndex = 1, midValue);
        int right = magicFast(array, rightIndex, end);
        return right;
    }
}