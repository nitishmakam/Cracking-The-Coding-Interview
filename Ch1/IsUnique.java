import java.util.*;
class IsUnique{
    static boolean isUniqueChars(String s){
        if(s.length()>128)
            return false;
        
        boolean[] char_set = new boolean[128];
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i);
            if(char_set[val])
                return false;
            char_set[val]=true;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        System.out.println(isUniqueChars(input));
        sc.close();
    }
}