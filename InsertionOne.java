import java.util.Scanner;
public class InsertionOne{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        n=sc.nextInt();
        int a[]=new int[n+1];
        System.out.println("enter the values ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("your array is");
        for(int i=0;i<n;i++)
        {
        System.out.println(a[i]);
        }
        System.out.println("enter the value for insertion");
        int c=sc.nextInt();
        System.out.println("enter the location where you want to insert");
        int d=sc.nextInt();
       
        for(int i=n-1;i>=d;i--){
        a[i+1]=a[i];
        }
        a[d]=c;
         for(int i=0;i<n+1;i++)
         {
         System.out.println("after insertion your array is "+a[i]);
         }

    }
}