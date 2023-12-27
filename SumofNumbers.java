import java.util.Scanner;
public class SumofNumbers{
    public static void main(String args[]){
        int a,b,c,d,e;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();


        int f=(a+b+c+d+e);
        System.out.println("the sum of numbers are "+f);
        float g=(a+b+c+d+e)/5;
        System.out.println("the average of numbers are "+g);

    }
}