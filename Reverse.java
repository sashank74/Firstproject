import java.util.Scanner;
public class Reverse{
	public static void main(String[] args){
		Scanner Input = new Scanner(System.in);
		System.out.println("enter sen to reverse");
		String sen = Input.nextLine();
		StringBuilder sent = new StringBuilder(sen);
		System.out.println("Reversed string is:");
		System.out.println(sent.reverse().toString());
	}
}