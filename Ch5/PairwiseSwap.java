import java.util.*;
class PairwiseSwap{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int d=sc.nextInt();
        System.out.println(pairwiseSwap(d));
        sc.close();
    }
    static int pairwiseSwap(int d){
        
        return (((d&0xaaaaaaaa)>>>1) | ((d&0x55555555)<<1));
    }
}