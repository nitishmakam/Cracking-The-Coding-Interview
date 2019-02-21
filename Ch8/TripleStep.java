import java.util.Scanner;
import java.util.Arrays;
class TripleStep{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countWays(n));
        sc.close();
    }

    static int noOfSteps(int n){
        if(n<0){
            return 0;
        } else if(n==0){
            return 1;
        }
        return noOfSteps(n-1)+noOfSteps(n-2) + noOfSteps(n-3);
    }

    static int countWays(int n){
        int memo[] = new int[n+1];
        Arrays.fill(memo,-1);
        return countWays(n,memo);
    }

    static int countWays(int n,int[] memo){
        if(n<0){
            return 0;
        }
        else if(n==0){
            return 1;
        } else if(memo[n]>-1){
            return memo[n];
        }else{
            memo[n]=countWays(n-1,memo)+countWays(n-2,memo)+countWays(n-3,memo);
            return memo[n];
        }
    }
}