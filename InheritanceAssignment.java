import java.util.Scanner;
class Person{
    String firstName,lastName;
    int id;
    public void setFirstName(){
        System.out.println("Enter your first name: ");
        Scanner sc=new Scanner(System.in);
        firstName=sc.nextLine();
        
        System.out.println("your first name is: "+firstName);

    }
    public void setLastName(){
        System.out.println("enter your last name: ");
        Scanner sc=new Scanner(System.in);
         lastName=sc.nextLine();
        System.out.println("your last name is: "+lastName);
    }
    public String getFirstName(){
        return firstName+lastName+id;

    }
}
class Employee extends Person{
    public void setEmployeeId(){
        System.out.println("enter the employee id:");
        Scanner sc=new Scanner(System.in);
         id=sc.nextInt();
        System.out.println("your employee id is: "+id);
    }
}
public class InheritanceAssignment{
    
    public static void main(String args[]){

        Employee e=new Employee();
        e.setFirstName();
        e.setLastName();
        e.setEmployeeId();

        e.getFirstName();
        System.out.println(e.getFirstName());

    }
}