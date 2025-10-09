import java.util.Scanner;
public class Challenge_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("ENTER YOUR FIRST SIDE LENGTH (IN CMS):");
        double num1 = input.nextDouble();

        System.out.print("ENTER YOUR SECOND SIDE LENGTH (IN CMS):");
        double num2 = input.nextDouble();

        System.out.print("ENTER YOUR THIRD SIDE LENGTH (IN CMS):");
        double num3 = input.nextDouble();

        System.out.print("ENTER YOUR FOURTH SIDE LENGTH (IN CMS):");
        double num4 = input.nextDouble();

        System.out.println("PERIMETER OF RECTANGLE FROM THE GIVEN DATA WOULD BE (IN CMS): "+(num1+num2+num3+num4));
    }
}
