import java.util.Scanner;
class vehicle{
    String modelName;
    int yom;
    String color;
    String fuel;
    public void Model(){
        System.out.println("enter the model Name ");
        Scanner sc=new Scanner(System.in);
        modelName=sc.nextLine();
        System.out.println("your model Name is "+modelName);
    }
    public void yom(){
        System.out.println("enter year of manufacture");
        Scanner sc=new Scanner(System.in);
        yom=sc.nextInt();
    }
    public void color(){
        System.out.println("enter the color of car");
        Scanner sc=new Scanner(System.in);
        color=sc.nextLine();
    }
    public String information(){
        return "Model name is:"+modelName+" year of manufacturing is: "+yom+" color of Model is:"+color;
    }
    
}
class Truck extends vehicle{
    public void fuelType(){
    System.out.println("enter the fuel type of truck");
    Scanner sc=new Scanner(System.in);
    fuel=sc.nextLine();
    System.out.println("Fuel type of truck is "+fuel);

}}
class Car extends vehicle{
    public void fuelType(){

    
    System.out.println("enter the fuel type of car");

    Scanner sc=new Scanner(System.in);
    fuel=sc.nextLine();
    System.out.println("Fuel type is "+fuel);
    }
}
class MotorCycle extends vehicle{
    
    public void fuelType(){
    System.out.println("enter the fuel type of MotorCycle");

    Scanner sc=new Scanner(System.in);
    fuel=sc.nextLine();
    
    System.out.println("Fuel type is "+fuel);
    }
    
}
public class VehicleInheritance{
    public static void main(String args[]){
        vehicle v=new vehicle();
        v.Model();
        v.yom();
        v.color();
        // v.information();
        
        Truck t=new Truck();
        t.fuelType();
        Car c=new Car();
        c.fuelType();
        MotorCycle m=new MotorCycle();
        m.fuelType();
        v.information();
        System.out.println(v.information());
    }
}