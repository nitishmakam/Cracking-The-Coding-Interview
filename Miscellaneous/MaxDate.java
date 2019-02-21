import java.util.Scanner;

class MaxDate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",");
        int[] in = new int[12];
        for(int i=0;i<12;i++){
            in[i]=Integer.parseInt(s[i]);
        }
        StringBuffer output = new StringBuffer();
        if(in[0]>=3){
            System.out.println("0");
        }
        else{
            
        }
        sc.close();
    }
}