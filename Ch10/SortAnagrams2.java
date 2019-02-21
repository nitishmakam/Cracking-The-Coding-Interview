import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMapList;

class SortAnagrams2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of strings");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        sortAnagrams(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }

    static void sortAnagrams(String[] arr) {
        HashMapList<String, String> mapList = new HashMapList<String, String>();
        for (String t : arr) {
            String key = sortChars(t);
            mapList.put(key, t);
        }
        int index=0;
        for(String key:mapList.keySet()){
            ArrayList<String> strings = mapList.get(key);
            for(String s:strings){
                arr[index]=s;
                index++;
            }
        }
    }

    static String sortChars(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}