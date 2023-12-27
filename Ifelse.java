import java.util.Scanner;

public class Ifelse{
    public static void main(String args[]){
        int a;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        if(a>=18){
            System.out.println("yes you can vote");
        }
        else{
            System.out.println("you cannot vote");
        }
        System.out.println("The age of user is "+a);

    }
}