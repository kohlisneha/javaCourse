
import java.util.Scanner;
public class GreatestNum{
    public static void main(String args[]){
        int a,b,c;
        System.out.println("Enter the first number");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();


        System.out.println("Enter the second number");
     
        b=scanner.nextInt();


        System.out.println("Enter the third number");
     
        c=scanner.nextInt();

         if(a>b && a>c){
            System.out.println("Number First is greatest");
         }
         else if(b>c && b>a){
            System.out.println("Number Second is greatest");
         }
         else if(c>a){
            System.out.println("Number Third is greatest");
         }

    }
}