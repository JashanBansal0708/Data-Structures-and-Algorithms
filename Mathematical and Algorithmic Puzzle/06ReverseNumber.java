/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseNumber {
    static int reverse(int number){
        int reverse = 0;
        for(; number > 0 ;){
            reverse = reverse* 10 + number%10;
            number = number / 10 ; 
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int result[] = new int[testCases];
        for(int i=0; i < testCases; i++){
            int number = scan.nextInt();
            result[i] = reverse(number);
        }
        scan.close();
        for(int i=0; i<testCases; i++){
            System.out.println(result[i]);
        }
    }
}