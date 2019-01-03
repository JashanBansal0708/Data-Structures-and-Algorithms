/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GCDOfArray {
    static int greatestCommonDivisor(int[] arr){
        int gcd = 1;
        int lowest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] > arr[i]){
                lowest = arr[i];
            }
        } 
        int count =0;
        int length = arr.length;
        for(int i=2; i <= lowest; i++){
            for(int j=0; j < arr.length; j++){
                if(arr[j]%i == 0){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count == length){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int result[] = new int[testCases];
        for(int i=0; i < testCases; i++){
            int arr[] = new int[scan.nextInt()];
            int length = arr.length;
            for(int j = 0; j< length; j++){
                arr[j] = scan.nextInt();
            }
            result[i] = greatestCommonDivisor(arr); 
        }
        for(int i=0; i<testCases; i++){
            System.out.println(result[i]);
        }
    }
}