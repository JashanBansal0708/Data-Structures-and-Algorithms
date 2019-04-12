// Time Complexity o(n2)
// Space Complexity o(1)

import java.io.*;


class FindPair{

    public static int[] findPair(int[] arr, int sum){
        int pair[] = new int[2];
        for(int i=0; i< arr.length-1; i++){
            for(int j=1; j< arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    pair[0] = i;
                    pair[1] = j;
                    return pair;
                }
            }
        }
        pair = new int[0];
        return pair;
    }


    public static void main(String args[]) throws IOException{
        System.out.println("Enter no. of test cases");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while( t-- != 0){
            System.out.println("Enter the array");
            String str = br.readLine();
            String[] strs = str.trim().split("\\s+");
            int[] arr = new int[strs.length];
            for(int i=0; i< strs.length; i++){
                arr[i] = Integer.parseInt(strs[i]);
            }
            System.out.println("Enter the sum");
            int sum = Integer.parseInt(br.readLine());
            int[] pair = findPair(arr, sum);    
            if((pair.length) !=  0){
                System.out.println("The indexes are " + pair[0] + " " + pair[1]);
            }
            else{
                System.out.println("No pair is present");
            }
        }
    }
}