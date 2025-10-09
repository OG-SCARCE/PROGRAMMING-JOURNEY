import java.util.Scanner;
public class programme_2 {
    static class Box {
        double width;
        double height;
        double depth;

        Box(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
        }

        Box(double w) {
            width = w;
            height = 10;
            depth = 5;
        }

        Box(double w, double h) {
            width = w;
            height = h;
            depth = 5;
        }

        Box() {
            width = 10;
            height = 10;
            depth = 5;
        }

        double volume() {
            return width * height * depth;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of values (0 or 3): ");
        int n = input.nextInt();

        Box userBox;
        if (n == 0) {
            userBox = new Box();
        }else if (n == 1) {
            System.out.print("Enter width: ");
            double w = input.nextDouble();
            userBox = new Box(w);
        } else if (n==2) {
            System.out.print("Enter width: ");
            double w = input.nextDouble();
            System.out.print("Enter height: ");
            double h = input.nextDouble();
            userBox = new Box(w, h);
        } else {
            System.out.print("Enter width: ");
            double w = input.nextDouble();
            System.out.print("Enter height: ");
            double h = input.nextDouble();
            System.out.print("Enter depth: ");
            double d = input.nextDouble();
            userBox = new Box(w, h, d);
        }

        System.out.println("========================================================");
        System.out.println("WIDTH: " + userBox.width + " HEIGHT: " + userBox.height + " DEPTH: " + userBox.depth);
        System.out.println("VOLUME: " + userBox.volume());
        System.out.println("========================================================");
    }
}
