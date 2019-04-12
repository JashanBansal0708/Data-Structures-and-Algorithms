import java.io.*;
import java.util.Map;
import java.util.HashMap;

class FindPair{
    public static int[] findPair(int[] arr, int sum){
        Map< Integer, Integer> map = new HashMap<>();
        int[] pair = new int[2];
        for(int i=0; i< arr.length; i++){
            if(map.containsKey(sum - arr[i])){
                pair[0] = map.get(sum-arr[i]);
                pair[1] = i;
                return pair;
            }
            map.put(arr[i], i);
        }
        pair = new int[0];
        return pair;
    }


    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of test cases");
        int t = Integer.parseInt(br.readLine());
        while(t-- != 0){
            System.out.println("Enter the array");
            String str = br.readLine();
            String strs[] = str.trim().split("\\s+");
            int[] arr = new int[strs.length];
            for(int i=0; i< strs.length; i++){
                arr[i] = Integer.parseInt(strs[i]);
            }
            System.out.println("Enter the sum");
            int sum = Integer.parseInt(br.readLine());
            int[] pair = findPair(arr, sum);
            if(pair.length != 0){
                System.out.println("The indexes are " + pair[0] + " " + pair[1]);
            }
            else{
                System.out.println("No pair found");
            }
       }       
    }
}