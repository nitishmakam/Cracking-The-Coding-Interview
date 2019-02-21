import java.util.*;
class StringCompression{
    static String compress(String s){
        int countConsecutive=0;
        StringBuilder output=new StringBuilder();
        for(int i=0;i<s.length();i++){
            countConsecutive++;

            if(i+1>=s.length() || s.charAt(i+1)!=s.charAt(i)){
                output.append(s.charAt(i));
                output.append(countConsecutive);
                countConsecutive=0;
            }
        }
        return output.length() < s.length() ? output.toString() : s; 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        System.out.println(compress(input));
        sc.close();
    }
}