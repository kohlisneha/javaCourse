import java.util.Scanner;
public class Factorial{

    static int fact(int n){
        
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }



    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
       System.out.println("The factorial of a number is "+fact(n));


        
    }
}