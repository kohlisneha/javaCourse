import java.util.Scanner;
class Parent{
    public void parentDetails(){
    System.out.println("This is Parent class");
    }
}
class child extends Parent{
    public void childDetails(){
    System.out.println("This is Child class");
    }
}

public class ParrentAssignment{
    public static void main(String args[]){
        Parent p=new Parent();
        p.parentDetails();
        child c=new child();
        c.childDetails();
        c.parentDetails();

    }
}