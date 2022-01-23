import java.util.Scanner;

public class distanceonsurfaceofearth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("input radius value");
        double r = in.nextDouble();
        System.out.println("input x1 value");
        double x1 = in.nextDouble();
        System.out.println("input y1 value");
        double y1 = in.nextDouble();
        System.out.println("input x2 value");
        double x2 = in.nextDouble();
        System.out.println("input y2 value");
        double y2 = in.nextDouble();
        earthsurfaceDistance(r, x1, y1, x2, y2);

    }

    static double earthsurfaceDistance(double r, double x1, double y1, double x2, double y2) {
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        double d = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println(d);
        return 0.0;
    }
}
