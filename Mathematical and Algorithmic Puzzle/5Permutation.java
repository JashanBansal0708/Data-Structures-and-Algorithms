/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Permutation {
    static double factorial(int number){
        double fact = 1;
        for(int i= number ; i > 1 ; i--){
            fact = i * fact;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        double result[] = new double[testCases];
        for(int i=0; i < testCases; i++){
            int n = scan.nextInt();
            int r = scan.nextInt();
            result[i] = factorial(n)/factorial(n-r);
        }
        for(int i=0; i<testCases; i++){
            System.out.println(String.format("%.0f", result[i]));
        }
    }
}