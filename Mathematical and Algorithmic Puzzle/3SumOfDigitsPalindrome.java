/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class SumOfDigitsPalindrome {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        String result[] = new String[testCases];
        for(int i=0; i<testCases; i++){
            int number = scan.nextInt();
            int digitsSum = 0;
            for(int j = 0; number > 0; j++){
                digitsSum = digitsSum + number % 10;
                number = number / 10;
            }              
            System.out.println(digitsSum);  

            int reverse = 0;
            int copy = digitsSum;
            for(int j = 0; copy > 0 ; j++){
                reverse = (10 * j)*(copy % 10);
                copy = copy/10;
            }
            System.out.println(reverse);  


            if(reverse == digitsSum){
                result[i] = "YES";
            }
            else{
                result[i] = "NO";
            }
        }
        for(int i=0; i<testCases; i++){
            System.out.println(result[i]);
        }
    }
}