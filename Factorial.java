import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		Scanner Input = new Scanner(System.in);
		System.out.println("enter the number to find factorial");
		int i,fac=1;
		int num = Input.nextInt();
		for(i = 1; i<=num; i++)
		{
			fac = fac*i;
		}
		System.out.println("the factor " + num + " is " + fac);
	}
}