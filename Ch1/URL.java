import java.util.*;

class URL{
    
    public static String replaceSpaces(String str){
        StringBuilder output = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                output.append("%20");
            }
            else{
                output.append(str.charAt(i));
            }
        }
        return output.toString();
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        input=replaceSpaces(input);
        System.out.println(input);
        sc.close();
    }
}