import java.util.Scanner;
public class Fibonacci{
	public static void main(String[] args){
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter the number for fibonacci series::");
		int num = Input.nextInt();
		int a=0,b=1,c=1;
		for(int i=1; i<=num; i++){
		 	c= a+b;
			a=b;
			b=c;
		System.out.println(c);

		}
		//System.out.println(c);

	}
}