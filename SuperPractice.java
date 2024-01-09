class Rectangle
{
    int length,breadth;
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void PrintArea()
    {
        System.out.println("The value for Area of Rect: "+length*breadth);
     }
    void PrintPerimeter()
    {
        System.out.println("The permiter of Rectangle is: "+2*length*breadth);
    }
    }
class Square extends Rectangle
{   int s;
    Square(int s)
    {
        super(s,s);
        System.out.println("Area of square is: "+s*s);
    }
}
public class SuperPractice
{
    public static void main(String args[])
    {
        Square s = new Square(2);
        s.PrintArea();
        s.PrintPerimeter();
    }
}