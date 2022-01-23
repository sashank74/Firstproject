import java.util.Scanner;

public class polygon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input the n values");
        double n = in.nextDouble();
        System.out.println("input the s values");
        double s = in.nextDouble();
        polygonArea(n, s);

    }

    static double polygonArea(double n, double s) {
        double m = (n * (s * s)) / (4 * Math.tan(Math.PI / n));
        System.out.println(m);
        return 0.0;

    }

}
