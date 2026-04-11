package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Hanoi(3 ,'A' , 'B' , 'C');
        
    }

    public static void Hanoi(int n , char a , char b , char c){
        if(n==0){
            return;
        }
        Hanoi(n-1 , a , c , b); // taking n-1 discs from A to B via C
        System.out.println(a + "->" + c );
        Hanoi(n-1 , b , a , c); //taking n-1 discs from b to c via a
    }

    
}
