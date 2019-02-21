import java.util.Scanner;

class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        boolean[] arr = sieveOfEratosthenes(max);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) {
                System.out.println(i);
            }
        }
        sc.close();
    }

    static boolean[] sieveOfEratosthenes(int max) {
        boolean[] flags = new boolean[max + 1];
        for (int i = 0; i < flags.length; i++) {
            flags[i] = true;
        }
        int prime = 2;
        while (prime <= Math.sqrt(max)) {
            crossOff(flags, prime);
            prime = getNextPrime(flags, prime);
        }
        return flags;
    }

    static void crossOff(boolean[] flags, int prime) {
        for (int i = prime * prime; i < flags.length; i += prime) {
            flags[i] = false;
        }
    }

    static int getNextPrime(boolean[] flags, int prime) {
        int next = prime + 1;
        while (next < flags.length && !flags[next]) {
            next++;
        }
        return next;
    }
}
