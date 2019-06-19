import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    private static int find(int n ,int m){
    }
	public static void main (String[] args) throws IOException 
    {
        BufferedReader br = new BufferedRedaer(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String result = "";
        while(t-- > 0){
            int n = Integer.parseInt(br.readline());
            int m = Integer.parseInt(br.readLine());
            result = Integer.toString(find(n,m));
        }
    }
}