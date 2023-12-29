
import java.util.Scanner;
public class BasePower{
    int a,b,result=1;
    private void print(){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base");
        a=sc.nextInt();
        
        System.out.println("enter the power");
        b=sc.nextInt();
            }

            private void PowerBase(){

                for(int i=0;i<b;i++){
                    result*=a;
                }
            }
            private void result(){
                System.out.println(result);
            }
    public static void main(String args[]){
       

BasePower bp=new BasePower();
bp.print();
bp.PowerBase();
bp.result();

    }
}