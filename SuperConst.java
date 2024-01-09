class BaseClass{
    BaseClass(){
        System.out.println("In constructor");
    }
    BaseClass(int a){
        System.out.println("in base parameterized "+a);
    }
}

class DerivedClass extends BaseClass{
    DerivedClass(){
        System.out.println("in derived class constructor");
    }
    DerivedClass(int a){
        super(a);
        System.out.println("in parameterized constructor");
    }
}
public class SuperConst
{
    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass(23);
    }
}
