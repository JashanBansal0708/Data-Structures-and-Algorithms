import java.util.*;
import java.lang.*;
import java.io.*;

class PairOfPrimenumbers{
    public static boolean prime(int number){
        boolean result = true;
        if(number < 3){
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
    public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        String result[] = new String[testCases];
        for(int i = 0; i< result.length; i++){
            result[i] = "";
        }
        int n = 0;
		for(int i=0; i<testCases; i++){
            n = scan.nextInt();
            ArrayList<Integer> prime = new ArrayList<Integer>();
            for(int j=2; j<= n ; j++){
                if(prime(j)){
                    prime.add(j);
                    // System.out.println(j);
                }
            }
            for(int j=0; j< prime.size(); j++){
                int first = prime.get(j);
                // System.out.println(first);
                for(int k=0; k< prime.size(); k++){
                    int second = prime.get(k);
                    // System.out.println(second);
                    if(first*second <= n){
                        result[i] = result[i] + Integer.toString(first) + " " + Integer.toString(second) + " ";
                        // System.out.println(first + " " + second);
                    }
                }
            }
        }
        scan.close();
        for(int i = 0; i< testCases ; i++){
            System.out.println(result[i]);
        }
	}
}