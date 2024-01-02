import java.util.Scanner;
public class ArraySecond{
    public static void main(String args[]){
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size 1");
        n1=sc.nextInt();
        System.out.println("enter the size 2");
        n2=sc.nextInt();
        int a[][]=new int[n1][n1];
        int b[][]=new int[n2][n2];
        if(n1!=n2){
            System.out.println("operation cannot be perfomed");
        }
        else{
            System.out.println("yes you can proceed");

        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.println("enter the values for first array");
                a[i][j]=sc.nextInt();
                System.out.println("enter the values for second array");
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.println("your result is "+(a[i][j]*b[i][j]));
            }
        }




            }
}