// Time complexity O(n logn) because i=of sorting
// Space complexity o(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

class FindPair{

    public static int[] findPair(int arr[], int sum ){
        int pair[] = new int[2];
        Arrays.sort(arr);   
        int low =0;
        int high = arr.length-1;
        for(int i=0; i< arr.length; i++){
            if(arr[low]+ arr[high] < sum){
                low++;
            }
            else if(arr[low]+ arr[high] > sum){
                high--;
            }
            else{
                pair[0] = low;
                pair[1] = high;
                return pair;
            }
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