class BaseClass{
    public void show(){
        System.out.println("Show function");
    }
}

class DerivedClass extends BaseClass{
    @Override
    public void show(){
        super.show();
        System.out.println("Show Functions of derived class");
    }
}
public class SuperMethod
{
    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        derivedClass.show();
    }
}
