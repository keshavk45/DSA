//Given a 2Xn board and tiles of size 2X1, count the number of ways to tile the given board using the 2X1 tiles. A tile can either be placed horizontally or vertically.
package Recursion;

public class TilingProblem{

    public static int Tiles(int n){
        if(n==0 || n==1){
            return 1;
        }

        //kaam vertical case
        int fnm1 = Tiles(n-1);
        //horizontal
        int fnm2 = Tiles(n-2);

        int totalways = fnm1 + fnm2;

        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(Tiles(3));
        
    }
}
