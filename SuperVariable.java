class BaseClass{
    int baseClassVariable;
    void showValue(){
        System.out.println("Value in BaseClass is "+baseClassVariable);
    }
}
class DerivedClass extends BaseClass{
    int baseClassVariable;
    void setVariable(int a){
        baseClassVariable = a;
        super.baseClassVariable = a;
    }
    int getVariable(){
        return baseClassVariable;
    }
}
public class SuperVariable
{
    public static void main(String[] args) {
        
        DerivedClass derivedClass = new DerivedClass();
        derivedClass.setVariable(12);
        System.out.println(derivedClass.getVariable());
        derivedClass.showValue();
    }
}