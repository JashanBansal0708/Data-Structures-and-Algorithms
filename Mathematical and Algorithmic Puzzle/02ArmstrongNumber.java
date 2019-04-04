import java.util.*;
import java.lang.*;
import java.io.*;

class Armstrong {
    private static String isArmstrong(int num){
        int copy = num;
        int sum = 0;
        while(copy!=0){
            int digit = copy % 10;
            sum += (int)Math.pow(digit,3);
            copy = copy / 10;
        }
        return sum == num? "YES": "NO";
    }
	public static void main (String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter number of Test Cases");
            int t = Integer.parseInt(br.readLine());
            // String result[] = new String[t]; 
            String result = ""; 

            for(int i=0; i< t; i++) {
                int num = Integer.parseInt(br.readLine());
                result += isArmstrong(num) + '\n';
            }
            System.out.println(result);

            // for(String str: result){
            //     System.out.println(str);
            // }
        }
        catch(IOException ex){
            System.out.println("Fail!");
        }
        
    }
}