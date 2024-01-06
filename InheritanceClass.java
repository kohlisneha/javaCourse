class Shape{
    public void draw(){
        System.out.println("In draw function");
    }
    private void ShapeFunction(){
        System.out.println("Shape function");
    }
}
class Rectangle extends Shape{}
class Square extends Shape{}

class Pyramid extends Rectangle{}

public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Shape shape = new Shape();
        shape.draw();
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        //rectangle.ShapeFunction();
    }
}
