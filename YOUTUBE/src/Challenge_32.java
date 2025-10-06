import java.util.Scanner;
import java.lang.Math;
public class Challenge_32{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE FIRST NUMBER : ");
        int num1=input.nextInt();
        System.out.print("ENTER THE SECOND NUMBER : ");
        int num2=input.nextInt();
        System.out.println("LCM OF DIGITS : "+lcmofdigits(num1,num2));
        int[] arr=new int[];
    }
    public static int lcmofdigits(int num1, int num2){
        if (num2<num1){
            num1+=num2;
            num2=num1-num2;
            num1-=num2;
        }
        for (int i = 1; i<Math.sqrt(num1);i++){
            if ( num1%i==0 && num2%i==0 ){
                
            }
        }


        return lcm;
    }
}
