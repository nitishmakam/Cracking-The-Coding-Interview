import java.util.Scanner;

class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        checkDuplicates(arr);
        sc.close();
    }

    static void checkDuplicates(int[] arr) {
        BitSet bs = new BitSet(32000);
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int num0 = num - 1;
            if (bs.get(num0)) {
                System.out.println(num);
            } else {
                bs.set(num0);
            }
        }
    }
}

class BitSet {
    int[] bitset;

    public BitSet(int size) {
        bitset = new int[size >> 5 + 1];
    }

    boolean get(int pos) {
        int wordNumber = pos >> 5;
        int bitNumber = pos & 0x1F;
        return (bitset[wordNumber] & (1 << bitNumber)) != 0;
    }

    void set(int pos) {
        int wordNumber = pos >> 5;
        int bitNumber = pos & 0x1F;
        bitset[wordNumber] |= (1 << bitNumber);
    }
}