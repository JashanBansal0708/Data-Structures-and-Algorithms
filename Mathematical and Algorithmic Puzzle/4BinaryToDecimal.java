/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class BinaryToDecimal {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int result[] = new int[testCases];
        for(int i=0; i<testCases; i++){
            double binaryNumber = scan.nextDouble();
            int decimalNumber = 0;
            int digit = 0;
            for(int j = 0; binaryNumber > 0; j++){
                digit = (int)(binaryNumber % 10);
                decimalNumber = ((int) Math.pow(2,j)) * digit + decimalNumber;
                binaryNumber = binaryNumber / 10;
            }              
            result[i] = decimalNumber;
        }
        for(int i=0; i<testCases; i++){
            System.out.println(result[i]);
        }
    }
}