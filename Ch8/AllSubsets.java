import java.util.ArrayList;
import java.util.Scanner;

class AllSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = sc.nextInt();
        ArrayList<Integer> set = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        ArrayList<ArrayList<Integer>> allsubsets = getAllSubsets(set);
        System.out.print("{");
        for (int i = 0; i < allsubsets.size(); i++) {
            ArrayList<Integer> subset = allsubsets.get(i);
            System.out.print("{");
            for (int j = 0; j < subset.size(); j++) {
                System.out.print(subset.get(j) + ",");
            }
            System.out.print("}");
        }
        System.out.print("}");
        sc.close();
    }

    static ArrayList<ArrayList<Integer>> getAllSubsets(ArrayList<Integer> set) {
        ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();
        int max = 1 << set.size();
        for (int i = 0; i < max; i++) {
            ArrayList<Integer> subset = convertIntoSubset(i, set);
            allsubsets.add(subset);
        }
        return allsubsets;
    }

    static ArrayList<Integer> convertIntoSubset(int i, ArrayList<Integer> set) {
        ArrayList<Integer> subset = new ArrayList<Integer>();
        int index = 0;
        for (int k = i; k > 0; k >>= 1) {
            if ((k & 1) == 1) {
                subset.add(set.get(index));
            }
            index++;
        }
        return subset;
    }

}