import java.util.*;

class IsPermutation{
    // public static String sort(String s){
    //     char[] content=s.toCharArray();
    //     Arrays.sort(content);
    //     return new String(content);
    // }
    public static boolean permutation(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        // return sort(s).equals(sort(t));
        int[] letters=new int[128];

        char s_array[]=s.toCharArray();
        for(char c:s_array){
            letters[c]++;
        }

        for(int i=0;i<t.length();i++){
            int c = (int)t.charAt(i);
            letters[c]--;
            if(letters[c]<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(permutation(s, t));
        sc.close();
    }
}