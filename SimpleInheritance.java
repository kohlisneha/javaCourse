import java.util.Scanner;
class RectArea{
    // int length,bredth;
    public void Calculate(int length,int bredth){
        int result=length*bredth;
        System.out.println("area of rectangle is "+result);

    }
}
class Square extends RectArea{
    // int s;
    public void Calculate(int s){
        int result=s*s;
        System.out.println("Area of sqaure is "+result);
    }
}
public class SimpleInheritance{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        RectArea ra=new RectArea();
        ra.Calculate(a,b);
        Square s=new Square();
        s.Calculate(a);

    }
}