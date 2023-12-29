import java.util.Scanner;
public class IntegerDecimal{
    public static void main(String args[]){
        float num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextFloat();
        int  integer=(int)num;
        float decimal=num-integer;
        System.out.println(integer);
        System.out.println(decimal); 
    }
}