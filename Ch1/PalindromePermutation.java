import java.util.*;
class PalindromePermutation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(isPalindromePermutation(input));
        sc.close();
    }
    static boolean isPalindromePermutation(String s){
        int x=createbitvector(s);
        return x==0 || isExactlyOneBitSet(x);
    }
    static boolean isExactlyOneBitSet(int x){
        return (x & (x-1))==0;
    }
    static int createbitvector(String s){
        int bitvector=0;
        for(char c:s.toCharArray()){
            int x=Character.getNumericValue(c);
            bitvector=toggle(bitvector, x);
        }
        return bitvector;

    }
    static int toggle(int bitvector,int x){
        if(x<0)
            return bitvector;
        int mask=1<<x;
        if((bitvector&mask) == 0){
            bitvector|=mask;
        }
        else{
            bitvector&=~mask;
        }
        return bitvector;
    }

}