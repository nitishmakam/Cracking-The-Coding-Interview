import java.util.Scanner;

class FindMajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(findMajorityElement(array));
        sc.close();
    }

    static int findMajorityElement(int[] array) {
        int candidate = getCandidate(array);
        return validate(array, candidate) ? candidate : -1;
    }

    static int getCandidate(int[] array) {
        int count = 0;
        int majority = 0;
        for (int a : array) {
            if (count == 0) {
                majority = a;
            }
            if (a == majority) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }

    static boolean validate(int[] array, int majority) {
        int count = 0;
        for (int a : array) {
            if (a == majority) {
                count++;
            }
        }
        return count > array.length / 2;
    }
}