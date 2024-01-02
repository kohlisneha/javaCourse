import java.util.Scanner;
public class ArrangingElements{
    public static void main(String args[]){
        int n;
        int a[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            
            a[i]=sc.nextInt();
        }
        System.out.println("your elements are");
        for(int i=0;i<n;i++){
            
            System.out.println(a[i]);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]>a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        System.out.println("your elements are");
        for(int i=0;i<n;i++){

                System.out.println(a[i]);
            
        }
        
        
        
            }
}