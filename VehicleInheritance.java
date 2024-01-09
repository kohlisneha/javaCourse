import java.util.Scanner;
class Vehicle{
    String modelName;
    int yom;
    String color;
    String fuel;
    Scanner sc = new Scanner(System.in);

    public void model(){
        System.out.println("enter the model Name ");
        modelName = sc.nextLine();
    }
    public void yom(){
        System.out.println("enter year of manufacture");
        yom=sc.nextInt();
    }
    public void color(){
        System.out.println("enter the color of car");
        color=sc.nextLine();
    }
    public String information(){
        return "Model name is: "+modelName+" year of manufacturing is: "+yom+" color of Model is: "+color+" fuel type is: "+fuel;
    }
    
}
class Truck extends Vehicle{
    public void fuelType(){
    System.out.println("enter the fuel type of truck");
    Scanner sc=new Scanner(System.in);
    fuel=sc.nextLine();
    System.out.println("Fuel type of truck is "+fuel);
    }

    Truck(){}
    Truck(Vehicle vehicle){
        modelName = vehicle.modelName;
    }
}
class Car extends Vehicle{
    public void fuelType(){
    System.out.println("enter the fuel type of car");
     Scanner sc=new Scanner(System.in);
    fuel=sc.nextLine();
    System.out.println("Fuel type is "+fuel);
    }
}
class MotorCycle extends Vehicle{
    public void fuelType(){
    System.out.println("enter the fuel type of MotorCycle");
    Scanner sc=new Scanner(System.in);
    fuel=sc.nextLine();
    System.out.println("Fuel type is "+fuel);
    }
    
}
public class VehicleInheritance{
    public static void main(String args[]){
        Vehicle v = new Vehicle();
        v.model();
        v.yom();
        v.color();
        // v.information();
        
        Truck t=new Truck(v);
    
        t.fuelType();
        Car c=new Car();
        c.fuelType();
        MotorCycle m=new MotorCycle();
        m.fuelType();
       System.out.println(t.information());
    }
}