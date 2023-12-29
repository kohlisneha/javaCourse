
import java.util.Scanner;
public class SumNum{
    public static void main(String args[]){
         int n;
        int [] a=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even+=a[i];
            }
            else{
                odd+=a[i];
            }
            System.out.println(even);
            System.out.println(odd);
        }

    }
}