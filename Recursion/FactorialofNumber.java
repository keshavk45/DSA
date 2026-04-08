//FACTORIAL OF A NUMBER

package Recursion;
import java.util.*;

public class FactorialofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fact(num);
        System.out.println(fact(num));
        }
    public static int fact(int num){
        if(num==0 || num == 1){
            return 1;
        }
        int ans  =  num*fact(num-1);
        return ans;
    }
    }

    

