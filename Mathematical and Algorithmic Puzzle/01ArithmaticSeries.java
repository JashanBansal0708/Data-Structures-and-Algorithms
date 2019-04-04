import java.util.*;
import java.lang.*;
import java.io.*;

class ArithmaticSeries{
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		int result[] = new int[testCases];
        for(int i=0; i<testCases; i++){
            int first = scan.nextInt();
            int second = scan.nextInt();
            int nth = scan.nextInt();
            int diff = second-first;            
            result[i] = first + (nth - 1) * diff;
        }
        scan.close();
        for(int i=0; i<testCases; i++){
            System.out.println(result[i]);
        }
	}
}