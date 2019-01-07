/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class ArmStrong {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		String result[] = new String[testCases];
        for(int i=0; i<testCases; i++){
            int number = scan.nextInt();
            int copy = number;
            int firstDigit = copy%10;
            copy = copy/10;
            int secondDigit = copy%10;
            copy = copy/10;
            int thirdDigit = copy%10;
            double power3Sum= Math.pow(firstDigit,3) + Math.pow(secondDigit,3) + Math.pow(thirdDigit,3); 
            if(power3Sum == number){
                result[i] = "Yes";
            }
            else{
                result[i] = "No";
            }
        }
        for(int i=0; i<testCases; i++){
            System.out.println(result[i]);
        }
	}
}