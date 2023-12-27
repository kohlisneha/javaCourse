import java.util.Scanner;


public class IfStatement{
    public static void main(String args[]){
     
      int a;
      Scanner scanner=new Scanner(System.in);
      a=scanner.nextInt();
      if(a>=18){
        System.out.println("yes you can vote!!");
      }
      System.out.print("The age of user is "+a);






    }
}