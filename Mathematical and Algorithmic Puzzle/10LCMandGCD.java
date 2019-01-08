/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class LCMandGCD {
    static int greatestCommonDivisor(int number1, int number2){
        int gcd = 1;
        int lowest = number1> number2 ? number2 : number1; 
        for(int i=2; i <= lowest; i++){
            if(number1%i == 0 && number2%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        String result[] = new String[testCases];
        for(int i=0; i < testCases; i++){
            int number1 = scan.nextInt();
            int number2 = scan.nextInt();
            int gcd = greatestCommonDivisor(number1, number2);
            int lcm = number1*number2/gcd;
             result[i] = String.valueOf(lcm) + " " + String.valueOf(gcd); 
        }
        scan.close();
        for(int i=0; i<testCases; i++){
            System.out.println(result[i]);
        }
    }
}