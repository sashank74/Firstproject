import java.util.Scanner;
public class Multiples{
	public static void main(String[] arg){
		System.out.println("enter the number you want to multiply");
		Scanner Input = new Scanner(System.in);
		int num = Input.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.printf("%s x %s = %s\n", num, i, i*num);
		}

	}
 
}