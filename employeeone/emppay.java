package employeeone;
import employee.*;
public class emppay{
    public static void main(String args[]){
        Employee e = new Employee();
        e.setName("sneha", "Kohli");
        e.setEmpid(1);
        e.setGender("female");
        System.out.println(e.getName());
        System.out.println(e.getEmpid());
        System.out.println(e.getGender());

    }
}