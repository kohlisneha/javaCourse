package first_package;

public class Practice{
    public void ShowPublic(){
        System.out.println("this is public");
    }
    private void ShowPrivate(){
        System.out.println("this is private");
    }
    protected void ShowProtected(){
        System.out.println("this is protected");
    }
    public void sum(int a,int b){
        
        int result=a+b;
        System.out.println("sum is"+result);

    }
    public static void main(String args[]){
        System.out.println("hello");
    }
}