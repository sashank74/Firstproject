import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("%d fizzbuzz\n", i);
            }

            else if (i % 3 == 0) {
                System.out.printf("%d fizz\n", i);

            } else if (i % 5 == 0) {
                System.out.printf("%d buzz\n", i);

            } else {
                System.out.println(i);
            }
        }
    }

}
