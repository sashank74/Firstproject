import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check odd or even");
        long num = in.nextLong();
        if (num % 2 == 0) {
            System.out.println("even");

        } else {
            System.out.println("odd");
        }

    }
}