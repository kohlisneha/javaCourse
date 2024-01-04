import java.util.Scanner;
class Rectangle{
    int length,bredth;
    Rectangle(){
        this.length=0;
        this.bredth=0;
    }
    Rectangle(int length,int bredth){
    this.length=length;
    this.bredth=bredth;
    }
    Rectangle(int side){
        this.length=side;
        this.bredth=side;
    }
    public int PrintValues(){
        // System.out.println("Area of Rectangle is");
        return length*bredth;
    }
}
public class ConstructorThird{
    public static void main(String args[]){
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(3,4);
        Rectangle r3=new Rectangle(2);
        System.out.println("area of rectangle is"+r1.PrintValues());
        System.out.println("area of rectangle is"+r2.PrintValues());
        System.out.println("area of rectangle is"+r3.PrintValues());
        

    }
}