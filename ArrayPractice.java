import java.util.Scanner;
public class ArrayPractice{
    public static void main(String args[]){
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the size of first size");
        n1=sc.nextInt();
        System.out.println("Enter the size of second size");
        n2=sc.nextInt();
        int a[][]=new int[n1][n1];
        int b[][]=new int[n2][n2];
       if(n1!=n2){
        System.out.println("operation cannot be performed");
       }
       else{
        System.out.println("yes you can proceed futher...continue");
       }
       for(int i=0;i<n1;i++){
        for(int j=0;j<n2;j++){
            System.out.println("enter the digits");
             a[i][j]=sc.nextInt();
             System.out.println("enter the other digits");
             b[i][j]=sc.nextInt();
        }
       }
       for(int i=0;i<n1;i++){
        for(int j=0;j<n2;j++){
            System.out.println("your result is "+(a[i][j]+b[i][j]));
            
        }
       }

        
    }
}



