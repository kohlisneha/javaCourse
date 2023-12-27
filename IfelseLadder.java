import java.util.Scanner;
public class IfelseLadder{
    public static void main(String args[]){
        int a;
        System.out.print("enter the age ");
        Scanner scanner=new Scanner(System.in);

        a=scanner.nextInt();

        if(a>=16 && a<18){
            System.out.println("learning license");
        }
        else if(a>=18 && a<=55){
            System.out.println("license created for 20 years");

        }
        else if(a>55){
            System.out.println("validation for 5 years only");
        }
        else{
            System.out.println("you are not eligible for license");
        }
    }
}