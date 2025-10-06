import java.util.Scanner;
public class Programme_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("ENTER THE INDEX VALUE : ");
        System.out.println("FIBONACCI : "+fibonacci(input.nextInt()));
    }

    public static int fibonacci (int num) {
        int a=0;
        int b=1;
        int fib = 1;

        if (num < 2){
            fib = num;
        }else{
            for (int i=0; i<=num; i++) {
                fib = a+b;
                a=b;
                b=fib;
            }
        }
        return fib;
    }
}
