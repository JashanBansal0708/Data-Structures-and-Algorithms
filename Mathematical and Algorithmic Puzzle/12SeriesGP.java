import java.util.*;
import java.lang.*;
import java.io.*;

class SeriesGP{
	public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int result[] = new int[testCases];
        for(int i=0; i< testCases ; i++){
            int first = scan.nextInt();
            int second = scan.nextInt();
            int n = scan.nextInt();
            double nth = first * Math.pow((double)second/first, n-1);
            // Precision plays important role here
            result[i] = (int)Math.floor(nth);
        }
        scan.close();
        for(int i=0; i< testCases; i++){
            System.out.println(result[i]);
        }
	 }
}