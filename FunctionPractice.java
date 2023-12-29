
public class FunctionPractice
{
    private void showFunction(){
        System.out.println("This is show Function ");
        staticFunction();
    }
   
    private static void staticFunction(){
        System.out.println("in static function ");
    }
   
    private void NoArgumentNoReturn(){
        System.out.println("No argument no return ");
    }
   
    private void withArgumentNoReturn(int a,int b, int c){
        System.out.println("In function with argument no return "+a+b+c);
    }
   
    private int noArgumentWithReturn(){
        return 10;
    }
   
    private int withArgumentWithReturn(int a){
        return a*10;
    }
    public static void main(String[] args) {
        FunctionPractice main = new FunctionPractice();
        main.showFunction();
        main.NoArgumentNoReturn();
        main.withArgumentNoReturn(1,2,3);
        int a = main.noArgumentWithReturn();
        System.out.println(a);
        System.out.println(main.noArgumentWithReturn());
        System.out.println(main.withArgumentWithReturn(90));
    }
}