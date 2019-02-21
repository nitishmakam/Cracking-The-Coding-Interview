import java.util.*;

class ToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        System.out.println(toBinary(d));
        sc.close();
    }

    static String toBinary(double d) {
        if(d<=0 || d>=1){
            return "ERROR";
        }

        StringBuilder binary=new StringBuilder();
        binary.append(".");
        double frac=0.5;
        while(d!=0){
            if(binary.length()>32){
                return "ERROR";
            }
            if(d>=frac){
                binary.append("1");
                d-=frac;
            }else {
                binary.append("0");
            }
            frac/=2;
        }
        return binary.toString();
    }
}