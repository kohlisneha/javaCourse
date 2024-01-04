import java.util.Scanner;
public class Currency{
    public static void main(String args[]){
        int n;
        System.out.println("enter the size");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
              System.out.println("enter the currency denomination");
              a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("Enter the amount you want to pay");
      
        int num=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]>a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                    }}}
                    for(int i=0;i<n;i++){
                        if(num>=a[i]){
                            int c=num/a[i];
                            System.out.println("notes required of "+a[i]+" : "+c);
                            num= num - (a[i]*c);
                            }}
                            System.out.println(num);
                            if(num>0){
                                for(int i=n-1;i>0;i--){
                                    if(a[i]>=num)
                                    System.out.println(a[i]);
                                    }
                                    }
}
}