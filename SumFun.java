import java.util.Scanner;
public class SumFun{
    
    public static int Sum(int first,int last){
        int sum=0;
        if(first<=last){
            for(int i=first;i<=last;i++){
                sum+=i;
            }
        }
        else{
            for(int i=first;i>=last;i--){
                sum+=i;
            }
        }
        return sum;

    }



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

         System.out.println("your sum is "+Sum(a,b));
        // System.out.println("your sum is "+Sum(a,b));
        // System.out.println("your sum is "+Sum(a,b));
        // System.out.println("your sum is "+Sum(a,b));
        
        


    }
}