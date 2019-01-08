import java.util.*;
import java.lang.*;
import java.io.*;

class PrintKthDigit{
	public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int result[] = new int[testCases];
        for(int i = 0; i< testCases ; i++){
            int first = scan.nextInt();
            int second = scan.nextInt();
            int k = scan.nextInt();
            double kth = 0;
            double power = Math.pow(first, second);
            for(int j = 0; j<k; j++){
                kth = power % 10;
                power = power / 10; 
            }
            result[i] = (int)kth;
        }
        scan.close();
        for(int i = 0; i< testCases; i++){
            System.out.println(result[i]);
        }
	 }
}