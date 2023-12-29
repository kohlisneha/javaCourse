import java.util.Scanner;
public class FunctionHi{

  private void PrintHi(){
            System.out.println("hi");
}



    public static void main(String args[]){
         int a;
        //  System.out.println(a);
     Scanner sc=new Scanner(System.in);
     

    FunctionHi fh=new FunctionHi();
 
    do{

        System.out.println("enter any positive number");
        a=sc.nextInt();
        if(a==0){
            System.out.println("try again");
            System.out.print("enter anyother positive number");
            a=sc.nextInt();
        }
    for(int i=0;i<a;i++){
            fh.PrintHi();

    }
    }while(a>=0);

    }
}

