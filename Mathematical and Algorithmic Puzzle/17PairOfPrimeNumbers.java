import java.util.*;
import java.lang.*;
import java.io.*;

class PairOfPrimenumbers{
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i=0; i<testCases; i++){
            int n = scan.nextInt();
            ArrayList<Integer> prime = new ArrayList<Integer>();
            int sqrt = (int)Math.sqrt(n);
            for(int j=1; j<= sqrt; j++){
                if(sqrt%j == 0){
                    sqrt.add(j);
                }
            }
            for(int j=0; j< prime.size(); j++){
                int first = prime.get(j);
                for(int k=1; k< prime.size(); k++){
                    int second = prime.get(k);
                    if(first*second < n){
                        System.out.println(first + " " + second + " ");
                    }
                    k++; 
                }
                j++;
            }
            System.out.println();
        }
	}
}