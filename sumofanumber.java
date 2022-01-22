import java.util.Scanner;

public class sumofanumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = in.nextInt();
        System.out.println(getSum(n));
    }

    static int getSum(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;

        }
        return sum;

    }

}