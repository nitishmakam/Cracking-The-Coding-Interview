import java.util.*;

class StringRotation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(isRotation(s1,s2));
        sc.close();
    }

    static boolean isRotation(String s1,String s2){
        int len=s1.length();

        if(len==s2.length() && len>0){
            String s1s1=s1+s1;
            return s1s1.indexOf(s2)!=-1;
        }
        return false;
    }
}