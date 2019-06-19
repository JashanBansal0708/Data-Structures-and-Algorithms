import java.io.*;

class Subsequences{

    public static void subSequences(int[] arr){
        int n = (int)Math.pow(2, arr.length);
        for(int i=0; i<n; i++){
            for(int j=0; j< arr.length; j++){
                if((i & (1 << j)) != 0 ){
                    System.out.print(arr[j]+ " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- != 0){
            String str = br.readLine();
            String[] strs = str.trim().split("\\s+");
            int arr[] = new int[strs.length];
            for(int i=0; i<strs.length; i++){
                arr[i] = Integer.parseInt(strs[i]);
            }
            subSequences(arr);
        }
    }
}

