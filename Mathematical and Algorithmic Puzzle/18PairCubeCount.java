import java.util.*;
import java.lang.*;
import java.io.*;
class PairCubeCount
 {
     public static int pairCount(int n){
        int count = 0; 
        int cubeRoot = (int)Math.cbrt(n);
        for(int i=1; i<=cubeRoot; i++){
            for(int j=0; j<=cubeRoot; j++){
                if(Math.pow(i,3) + Math.pow(j,3) == n){
                    count++;
                }
            }
        }
        return count;
     }
	public static void main (String[] args)
	 {

        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int result[] = new int[testCases];
        for(int i=0; i< testCases; i++){
            int n = scan.nextInt();
            result[i] = pairCount(n);
        }
        scan.close();
        for(int i=0; i< testCases; i++){
            System.out.println(result[i]);
        }
	 }
}