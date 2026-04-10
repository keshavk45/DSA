package Recursion;

public class PrintSubset {
    
    public static void main(String[] args) {
        String str = "abc";
        Substring("" , str , 0 );
    }

    public static void Substring(String ans , String str , int idx){
        if(idx == str.length()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(idx);
        Substring(ans + ch , str ,idx + 1 );
        Substring(ans , str ,idx + 1 );

    }
}
