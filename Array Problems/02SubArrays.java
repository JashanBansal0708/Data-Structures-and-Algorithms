import java.io.*;


class SubArrays {
    public static void printSubArrays(int[] arr){
        for(int i=0; i< arr.length; i++){
            for(int j=i; j < arr.length; j++){
                System.out.print("{");
                for(int k = i ; k < j; k++){
                    System.out.print(arr[k] + ", ");
                }
                System.out.print(arr[j] + "}, ");
            }
        }
    }


    public static void main(String[] args) throws IOException{
        System.out.println("Enter the number of test cases");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- != 0){
            System.out.println("Enter the array");
            String str = br.readLine();
            String[] strs = str.trim().split("\\s+");
            int arr[] = new int[strs.length];
            for(int i=0; i< strs.length; i++){
                arr[i] = Integer.parseInt(strs[i]);
            }
            printSubArrays(arr);
        }
    }
}