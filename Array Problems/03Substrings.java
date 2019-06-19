import java.io.*;
// import java.String.*;

class SubStrings{

    public static void subStrings(String str){
        for(int i=0; i< str.length(); i++){
            for(int j=i; j< str.length(); j++){
                System.out.println(str.substring(i,j+1) + "  ");
            }
        }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of test cases");
        int t = Integer.parseInt(br.readLine());
        while(t-- != 0){
            System.out.println("Enter the String");
            String str = br.readLine();
            subStrings(str);
        }

    }
}