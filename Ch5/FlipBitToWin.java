import java.util.*;

class FlipBitToWin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        System.out.println(flipBit(d));
        sc.close();
    }

    static int flipBit(int a) {
        if (~a == 0) {
            return Integer.BYTES * 8;
        }
        int maxLength = 1;
        int currentLength = 0;
        int previousLength = 0;
        while (a != 0) {
            if ((a & 1) == 1) {
                currentLength++;
            } else if ((a & 1) == 0) {
                previousLength = (a & 2) == 0 ? 0 : currentLength;
                currentLength = 0;
            }
            maxLength = Math.max(previousLength + currentLength + 1, maxLength);
            a >>>= 1;
        }
        return maxLength;
    }
}