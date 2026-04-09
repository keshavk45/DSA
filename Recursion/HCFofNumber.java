// HCF of two number using loop

// package Recursion;
// import java.util.*;

// public class HCFofNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int num = 0;
//         for(int i = 1 ; i<a ; i++){
//             if(a%i==0 && b%i==0){
//                 num = i;
//             }
//         }
//         System.out.println(num);
//     }
    
// }

//METHOD 2 - USING RECURSION

package Recursion;
import java.util.*;

public class HCFofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(hcf(a, b));
    }

    public static int hcf(int a , int b){
        if(a == 0){
            return b;
        }
        return hcf(b%a, a);
    }
    
}

