import java.util.Scanner;
public class FunctionPractice{
    public static void main(String args[]){
        int a,b;
        a=0;
        b=1;
        for(int i=0;i<5;i++){
          int sum=a+b;
          a=b;
          b=sum;
          System.out.println(sum);
        }
    }
}