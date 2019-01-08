import java.util.*;
import java.lang.*;
import java.io.*;

class SeriesGP2{
	public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int result[] = new int[testCases];
        for(int i=0; i< testCases ; i++){
            int first = scan.nextInt();
            int second = scan.nextInt();
            int n = scan.nextInt();
            if(n == 1){
                result[i] = first;
            }
            else if(n == 2){
                result[i] = second;   
            }
            else{
                result[i] = (int)Math.floor(first * Math.pow((double)second/first, n-1));
            }
        }
        scan.close();
        for(int i=0; i< testCases; i++){
            System.out.println(result[i]);
        }
	 }
}

