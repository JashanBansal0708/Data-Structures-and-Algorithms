import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static boolean prime(int number){
        boolean result = true;
        if(number <= 3){
            return result;
        }
        int sqrt = (int)Math.sqrt(number);
        for(int i = 2; i<= sqrt; i++){
            if(number % i == 0){
                result = false;
            }
        }
        return result;
     }
	public static void main (String[] args)
	 {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int result[] = new int[testCases];
        for(int i=0; i< testCases; i++){
            int n = scan.nextInt();
            for(int j=2; j<=n; j++){
                if(prime(j)){
                    result[i] = result[i] + j; 
                }
            }
        }
        for(int i=0; i< testCases; i++){
            System.out.println(result[i]);
        }
	 }
}