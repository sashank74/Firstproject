import java.util.Scanner;

public class hexagon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number for length of a side of the hexagon");
        double s = in.nextDouble();
        double n = (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The Area of the hexagon is :" + n + "\n");

    }

}
