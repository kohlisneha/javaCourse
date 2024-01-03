//constructor - default, parameterized, copy
//default constructor is created by compiler
//Cannot call the constructor
//Constructor cannot return anything
//Overloading - function, Constructor

class Animal{
    public int a, b = 10; // instance
    Animal(int a){
        this.a = a;
    }
    Animal(){}
    public void showSum(){
        System.out.println("Sum of a and b is "+(a+b));
    }
}
public class ConstructorPractice
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Animal animal = new Animal(10);
        animal.showSum();
        System.out.println("animal.a "+animal.a);
    }
}
