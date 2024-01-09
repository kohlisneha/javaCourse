class Member{
    String name;
    int age;
    String mobile;
    String address;
    int salary;
    Member(String name,int age,String mobile,String address,int salary){
        this.name=name;
        this.age=age;
        this.mobile=mobile;
        this.address=address;
        this.salary=salary;
    }
    public void PrintSalary(){
        System.out.println("Salary of a employee is "+salary);
    }
}
class Employee extends Member{
    String depart;
    Employee(String name,int age,String mobile,String address,int salary,String depart)
    {
        super(name,age,mobile,address,salary);
        this.depart=depart;
    }

}

class Manager extends Member{
    String spec;
    Manager(String name,int age,String mobile,String address,int salary,String spec){
        super(name,age,mobile,address,salary);
        this.spec=spec;
    }

}

public class SuperMember{
    public static void main(String args[]){
        Employee e=new Employee("sneha",20,"8699776132","47 new jawahar nagar",50000,"cse");
        Manager m=new Manager("sneha",20,"8699776132","47 new jawahar nagar",50000,"software engineering");
        System.out.println("Employee details");
        System.out.println("Name is "+e.name);
        System.out.println("age is "+e.age);
        System.out.println("address is "+e.address);
        System.out.println("phone number is "+e.mobile);
        System.out.println("salary is "+e.salary);
        System.out.println("department is "+e.depart);

        System.out.println("Manager details");
        System.out.println("name is "+m.name);
        System.out.println("age is "+m.age);
        System.out.println("address is "+m.address);
        System.out.println("phone no "+m.mobile);
        System.out.println("salary is "+m.salary);
        System.out.println("specialization is "+m.spec);

        e.PrintSalary();
        m.PrintSalary();



    }
}