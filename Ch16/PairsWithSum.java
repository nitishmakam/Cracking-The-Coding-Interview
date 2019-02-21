import java.util.ArrayList;
import java.util.Scanner;
import javafx.util.Pair;

class PairsWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum");
        int sum = sc.nextInt();
        ArrayList<Pair> result = getPairSums(array, sum);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + "\n");
        }
        sc.close();
    }

    static ArrayList<Pair> getPairSums(int[] array, int sum) {
        ArrayList<Pair> result = new ArrayList<Pair>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    result.add(new Pair(array[i], array[j]));
                }
            }
        }
        return result;
    }
}