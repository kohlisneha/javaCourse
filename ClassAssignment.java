
import java.util.Scanner;
class Student{
    public String s;

    Student(){
        s="UNKNOWN";

    }
    Student(String s){
            this.s=s;
    }
    public void PrintValues(){
        System.out.println("entered value is "+s);
    }
}
public class ClassAssignment{
    public static void main(String args[])
    {
        
        Student s=new Student();
        
        Student st=new Student("sneha");
        s.PrintValues();
        st.PrintValues();

    }
}