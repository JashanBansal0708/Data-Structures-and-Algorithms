import java.util.*;
class FractionAddition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			GfG g = new GfG();
			g.addFraction(a,b,c,d);
		T--;
		}
	}
}

/*You are required to complete this function*/
class GfG
{ 	
    int greatestCommonDivisor(int number1, int number2){
        int gcd = 1;
        int lowest = number1> number2 ? number2 : number1; 
        for(int i=2; i <= lowest; i++){
            if(number1%i == 0 && number2%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    void addFraction(int num1, int den1, int num2, int den2)
    {
        int gcd = greatestCommonDivisor(den1,den2);
        int denx = den1 * den2 / gcd;
        int numx = denx/den1 * num1 + denx/den2 * num2;
        int common = greatestCommonDivisor(numx, denx);
        numx = numx/common;
        denx= denx/common;
        System.out.println( numx + "/" + denx);
    }
}