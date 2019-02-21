import java.util.*;

class BitSwapRequired {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(bitSwapRequired(a, b));
        sc.close();
    }

    static int bitSwapRequired(int a, int b) {
        int count=0;
        for(int c=a^b;c!=0;c=c&(c-1)){
            count++;
        }
        return count;
    }
}