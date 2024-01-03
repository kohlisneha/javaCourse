import java.util.Scanner;

public class ConstructorSecond{
    private void Area(int length,int bredth){
      System.out.println("area of rectangle is "+length*bredth);
    }
    private void Area(int c){
         System.out.println("sqaure is "+c*c);
    }
    private void Area(float r){
        float pi=3.14f;
        System.out.println("area of circle is "+2*pi*r);
    }

    public static void main(String args[]){
        int a;
        Scanner sc=new Scanner(System.in);
        // /System.out.println("Enter  number ");
        System.out.println("Press 1 For Area Of Rectangle");
        System.out.println("Press 2 For Area Of square");
        System.out.println("Press 3 For Area Of Circle");
        a=sc.nextInt();
        ConstructorSecond cs = new ConstructorSecond();
        
        switch(a)
        {
            case 1:
                System.out.println("Enter the values ");
                System.out.println("Enter the value for length");
                int  length=sc.nextInt();
                System.out.println("enter the value for breadth");
                int bredth=sc.nextInt();

                cs.Area(length,bredth);
            break;
            case 2:
               
                System.out.println("Area of square");
                System.out.println("enter the value ");
                int c=sc.nextInt();
                cs.Area(c);
            break;
            case 3:

                System.out.println("Area of Circle");
                System.out.println("enter the value for radius");
                float r=sc.nextFloat();
                cs.Area(r);
                break;
            default:
                System.out.println("Number is not valid");
        }
        
        // ConstructorSecond cs = new ConstructorSecond();
        
        
        // cs.Area(2,3);
        
        // cs.Area(2);
        // cs.Area(2.8f);
        

    }
}