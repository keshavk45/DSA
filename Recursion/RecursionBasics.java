//Basic Recursion Example


// package Recursion;

// import java.util.Scanner;

// public class RecursionBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         print(n);
//     }

//     public static void print(int n){
//         if(n==0){
//             return;
//         }else{
//             System.out.println(n);
//             print(n-1);
//         }



//     }


    

// }


//PRINT 1 TO N;

package Recursion;

import java.util.Scanner;

public class RecursionBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1 , n);
    }

    public static void print(int x , int n){
        if(x>n){
            return;
        }else{
            System.out.println(x);
            print(x+1 , n);
        }



    }


    

}

