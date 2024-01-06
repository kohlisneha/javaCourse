import java.util.Scanner;
class Rect{
    public void area(int length,int bredth){
        int result=length*bredth;
        System.out.println("result is"+result);
    }
}
class Square extends Rect{
    public void area(int s){
        int result=s*s;
        System.out.println("result is"+result);
    }
}
class circle extends Square{
    float pi=3.14;
    public void area(int r){

        int result=2*pi*r;
        System.out.println("result is ")
    }
}
public class MultiLevel
{
    
    public static void main(String args[]){

    }
}