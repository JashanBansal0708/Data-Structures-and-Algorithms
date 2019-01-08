/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class PrimeNumber{
    public static String prime(int number){
        String result = "Yes";
        for(int i =2; i<= Math.sqrt(number); i++){
            if(number % i == 0){
                result = "No";
            }
        }    
        return result;
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        String result[] = new String[testCases];
        for(int i=0; i<testCases; i++){
            int number = scan.nextInt();
            result[i] = prime(number); 
        }   
        scan.close();
        for(int i=0; i<testCases; i++){
            System.out.println(result[i]);
        }
    }
}