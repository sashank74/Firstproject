import java.util.Scanner;
public class SimpleCalculator{
	public static void main(String[] args){
		Scanner Input = new Scanner(System.in);
		System.out.println("enter first number");
		double a = Input.nextInt();
		System.out.println("enter second number");
		double b = Input.nextInt();
		System.out.println("Enter opertator '+' for addition, '-' for subtraction, '*'for multiplication, '/'for divison");
		char c = Input.next().charAt(0);
		switch(c)
		{
			case '+':
			double addition = a+b;
			System.out.println("the sum is " + addition);
			break;
			case '-':
			double subtraction = a-b;
			System.out.println("the sub is " + subtraction);
			break;
			case '*':
			double multiplication = a*b;
			System.out.println("the mul is " + multiplication);
			break;
			case '/':
			double divison = a/b;
			System.out.println("the div is "+ divison);
			break;
			default:
			System.out.println("please enter the valid symbol");

		}




	}
}