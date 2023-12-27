import java.util.Scanner;
public class ValidTriangle{
    public static void main(String args[]){
        int a,b,c;
        System.out.println("enter the degrees of angles ");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        int d=a+b+c;
        if(d==180){
            System.out.println("yes it is a valid triangle");
        }
        else{
            System.out.println("No,it is not a valid triangle");
        }
    }
}