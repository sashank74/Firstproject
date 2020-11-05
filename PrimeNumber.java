import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args){
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter if the number in prime or not");
		long num = Input.nextLong();
		long count=0;
		for(long i=1; i<=Math.sqrt(num); i++){
			if(num%i==0){
				count=count+1;

			}

		}
			if(count==2)

				System.out.println("prime");

			else

				System.out.println("not prime");

	}
}