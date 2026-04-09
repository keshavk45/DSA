// //METHOD 1  - DIRECT USING INBUILT MATH.POW METHOD

// package Recursion;
// import java.util.*;

// public class PowerRaise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter base");
//         int a = sc.nextInt();
//         System.out.println("enter exponential");
//         int b = sc.nextInt();
//         System.out.println(Math.pow(a, b));      
//     }
    

    
// }





// //METHOD 2 - USING RECURSION

// package Recursion;
// import java.util.*;

// public class PowerRaise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter base");
//         int a = sc.nextInt();
//         System.out.println("enter exponential");
//         int b = sc.nextInt();
//         System.out.println(pow(a, b)); 
        
        
//     }

//     public static int pow(int a , int b){
//         if(b==0){
//             return 1;
//         }
//         int res = a*pow(a, b-1);
//         return res;

//     }
    

    
// }





//METHOD 3 - USING EVEN ODD LOGARITHMIC TIME COMPLEXITY WAY

package Recursion;
import java.util.*;

public class PowerRaise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        int a = sc.nextInt();
        System.out.println("enter exponential");
        int b = sc.nextInt();
        System.out.println(pow(a, b)); 
        
        
    }

    public static int pow(int a , int b){
        if(b==0){
            return 1;
        }
        int call = pow(a, b/2);
        if(b%2==0){
            return call*call;
        }else {
            return a*call*call;
        }        
    }   
}



